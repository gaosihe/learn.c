package Dingshi;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer0727 {
//        public static void main(String[] args) {//间隔一定时间运行后
//
//            Timer timer=new Timer();
//
//            System.out.println(new Date());
//            System.out.println("---");
//
//            timer.schedule(new TimerTask(){
//                @Override
//                public void run() {
//                    System.out.println(new Date());
//                }
//            },2000);
//        }
    public static void main(String []args) {//间隔一定时间运行后,在每隔一段时间运行
        Timer timer = new Timer();
        System.out.println( new Date());
        System.out.println("---");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(  new Date());
            }
        }, 2000, 2000);
    }
}
