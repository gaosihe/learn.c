package Dingshi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTask0727 {
//    public static void main(String []args) {//定时器指定时间运行
//
//        try {
//            Timer timer = new Timer();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String dateString = "2020-7-27 20:57:00";
//            Date dateRef = sdf.parse(dateString);
//            System.out.println("字符串时间：" + dateRef +",当前时间：" + new Date());
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    System.out.println("任务运行了：,当前时间：" + new Date());
//                    timer.cancel();
//                }
//            }, dateRef);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String []args) {//定时器指定时间运行,运行后每间隔一定时间继续运行
        try {
            Timer timer = new Timer();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2020-6-6 22:16:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef +",当前时间：" + new Date());
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("任务运行了：,当前时间：" + new Date());
                }
            }, dateRef, 2000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
