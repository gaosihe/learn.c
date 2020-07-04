import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class ThreadWaitThenDo {
    @Test
    public void t1() throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0;i<20;i++){
           final int j = i;
           threads[i]=new Thread(()->{
               System.out.println(j);
           });
           threads[i].start();
        }
        for (int i = 0;i<20;i++){
            threads[i].join();
        }
        System.out.println("main");
    }
    @Test
    public void t2() throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(20);
        for (int i = 0;i<20 ;i++){
            final int j = i;
            new Thread(()->{
                System.out.println(j);
                cdl.countDown();//数量--
            }).start();
        }
        cdl.await();//数量=0往下执行,否则当前线程阻塞等待
        System.out.println("main");
    }
    @Test
    public void t3() throws InterruptedException {
        Semaphore s = new Semaphore(0);//许可证=0
        for (int i = 0;i<20 ;i++){
            final int j = i;
            new Thread(()->{
                System.out.println(j);
                s.release();//许可证数量++,也可以指定增加的数量
            }).start();
        }
        s.acquire(20);//获取指定数量的许可证,Semaphore中的许可证的数量减去acquire的数量
        System.out.println("main");
    }
    //有限资源访问
    //同一时间,只允许1000个并发的http请求
    @Test
    public void t4() throws InterruptedException {
        Semaphore s = new Semaphore(1000);//许可证=0
        for (;;){
            s.acquire();//许可证数量--,许可证数量==0,就阻塞等待
            new Thread(()->{
                try {
                    //处理http请求的逻辑,
                } finally {
                    s.release();//许可证数量++,也可以指定增加的数量
                }
            }).start();
        }
    }
}
