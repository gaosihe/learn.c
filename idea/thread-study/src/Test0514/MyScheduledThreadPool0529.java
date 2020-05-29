package Test0514;

import javafx.stage.StageStyle;

import java.util.Date;
import java.util.concurrent.PriorityBlockingQueue;

public class MyScheduledThreadPool0529 {
    //员工
    private Thread[] threads;//可以去掉,直接在构造方法中new
    //仓库
    private PriorityBlockingQueue<MyTimerTask> queue = new PriorityBlockingQueue<>();
    public MyScheduledThreadPool0529(int capacity){
        threads = new MyTimer[capacity];
        for( int i = 0;i<capacity;i++){
            threads[i] = new MyTimer(queue);
            threads[i].start();
        }
    }
    //执行定时任务:任务,延迟时间(毫秒),间隔时间
    public void schedule(Runnable runnable,long delay,long period){
        MyTimerTask task = new MyTimerTask(runnable,new Date().getTime()+delay,period);
        synchronized (queue) {
            queue.put(task);
            queue.notifyAll();
        }
    }
    //员工
    private static class MyTimer extends Thread{
        private PriorityBlockingQueue<MyTimerTask> queue;
        public MyTimer(PriorityBlockingQueue<MyTimerTask> queue) {
            this.queue=queue;
        }

        @Override
        public void run() {
            while (true){
                //take和put,在达到下限和上限时,时阻塞等待
                //poll和offer时非阻塞方法,如果达到下限和上限时,返回空
                try {
                    MyTimerTask task = queue.take();
                    synchronized (queue){
                        long current = System.currentTimeMillis();
                        if (current < task.next){
                            queue.wait(task.next - current);
                            //等待直到满足下次执行时间,需要重新从仓库重新取包裹-
                            // ->可能有时间更短(更紧急的包裹要派送)
                            queue.put(task);//之前从仓库取出来了,要重新放回去(此处没有执行)
                        }else {
                            task.run();
                            if(task.period >0){
                                task.next = task .next +task.period;//下次执行时间修改为当前的next+period
                                queue.put(task);
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //定时任务
    private static class MyTimerTask implements Runnable,Comparable<MyTimerTask>{
        private Runnable runnable ;
        private long next;//下次执行时间
        private long period;//间隔时间
        public MyTimerTask(Runnable runnable, long next, long period) {
            this.runnable = runnable;
            this.next = next;
            this.period = period;
        }

        @Override
        public void run() {
            runnable.run();
        }

        @Override
        public int compareTo(MyTimerTask o) {
            return Long.compare(next,o.next);
        }
    }

    public static void main(String[] args) {
        MyScheduledThreadPool0529 pool0529 = new MyScheduledThreadPool0529(4);
        pool0529.schedule(()->{
            System.out.println("ABC");
        },99999,1000);
        pool0529.schedule(()->{
            System.out.println("D");
        },0,1000);
    }
}
