package CAS;

import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@NotThreadSafe
public class CAS0802 {

        public static int count = 0;

        public static void main(String[] args) {

            //新建一个线程池
            ExecutorService service = Executors.newCachedThreadPool();
            //Java8 lambda表达式执行runnable接口
            for (int i = 0; i < 5; i++) {
                service.execute(() -> {
                    for (int j = 0; j < 1000; j++) {
                        synchronized (CAS0802.class) {
                            //因为count++不是原子操作，所以最终结果有可能小于5000，
                            // 我们可以用synchronized保证操作的原子性和可见性
                            count++;
                        }
                    }
                });
            }
            //关闭线程池
            service.shutdown();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("count = " + count);
        }
    @ThreadSafe
    public static class CountTest {

        public static AtomicInteger count = new AtomicInteger(0);

        public static void main(String[] args) {

            ExecutorService service = Executors.newCachedThreadPool();
            for (int i = 0; i < 5; i++) {
                service.execute(() -> {
                    for (int j = 0; j < 1000; j++) {
                        count.getAndIncrement();
                        //synchronized属于悲观锁，它有一个明显的缺点，它不管数据存不存在竞争都加锁，
                        // 随着并发量增加，且如果锁的时间比较长，其性能开销将会变得很大。有没有办法解决这个问题？
                        // 答案是基于冲突检测的乐观锁。这种模式下，已经没有所谓的锁概念了，每个线程都直接先去执行操作，
                        // 检测是否与其他线程存在共享数据竞争，如果没有则让此操作成功，如果存在共享数据竞争则不断地
                        // 重新执行操作，直到成功为止，重新尝试的过程叫自旋
                    }
                });
            }
            service.shutdown();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("count = " + count);
        }
    }
}
