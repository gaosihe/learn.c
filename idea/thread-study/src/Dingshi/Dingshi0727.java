package Dingshi;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Dingshi0727 {//下一次延长一定时间运行,然后每隔固定时间运行

        public static void main(String[] args) {
            //给定大小的线程数
            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
            System.out.println(new Date());
            System.out.println("---");
            executorService.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    System.out.println(new Date());
                }
            }, 5, 2, TimeUnit.SECONDS);
        }
}
