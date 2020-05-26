package Test0514;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadVsThreadPool0526 {
    public static void main(String[] args) {
        //1,没使用线程,自己送快递
        System.out.println("送快递到北京1");
        System.out.println("送快递到上海1");
        System.out.println("处理自己的业务1");
        //2,使用手动创建线程的方式,雇佣人送快递,我做自己的事
        new Thread(() -> {
            System.out.println("送快递到北京2");
        }).start();
        new Thread(() -> {
            System.out.println("送快递到上海2");
        }).start();
        new Thread(() -> {
            System.out.println("处理自己的业务2");
        }).start();

        //3,使用JDK的线程池来送快递
        //创建线程池对象: 类似开了一家快递公司,专门处理送快递的任务
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4,//核心线程数 :快递公司正式员工-线程
                10,//最大线程数 :总员工(正式工+临时工)-线程
                // 临时工+空闲时间: 正式员工不够用,招聘临时工,临时工超过最大的空闲时间,就解雇
                60,//空闲时间数
                TimeUnit.SECONDS,//时间单位
                //阻塞队列 :快递公司仓库 - 存放线程的容器
                new ArrayBlockingQueue<Runnable>(1000),
//                new ThreadFactory() {//匿名内部类
//                    @Override
//                    public Thread newThread(Runnable r) {
//              // 线程的工厂类:快递公司招聘标准-创建线程的方式
//                        return new Thread(r);
//                    }
//                },
                //四种拒绝策略:接受到新快递单,但仓库容量不够存放包裹了
//                new ThreadPoolExecutor.AbortPolicy()//抛异常
//                new ThreadPoolExecutor.CallerRunsPolicy()//execute代码所在线程自己执行
//                new ThreadPoolExecutor.DiscardOldestPolicy()//丢弃最旧的
                new ThreadPoolExecutor.DiscardPolicy()//丢弃最新的
        );
        pool.execute(()->{//创建了一个送快递的任务
            System.out.println("送快递到北京3");
        });
        pool.execute(()->{
            System.out.println("送快递到上海3");
        });
        System.out.println("处理自己的业务3");
    }
}
