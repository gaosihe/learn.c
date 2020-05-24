package Test0514;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

public class SequencePrint {
    public static void print1(){//三个线程同时执行 打印ABC
        Thread t1 = new Thread(new Print("A",null));
        Thread t2 = new Thread(new Print("B",t1));
        Thread t3 = new Thread(new Print("C",t2));
        t1.start();
        t3.start();
        t2.start();
    }

    public static void main(String[] args) {
        print2();
    }
    private static class Print implements Runnable{
        private String content;
        private Thread t;

        public Print(String content,Thread t) {
            this.content = content;
            this.t = t;
        }

        @Override
        public void run() {
            try {
                if(t != null)//根据传入的t和null比较使得线程执行顺序为t1,t2,t3
                    t.join();
                System.out.println(content);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void print2(){//三个线程同时执行 打印ABC,循环10次
        for (int i = 0; i<Print2.ARRAY.length;i++){//根据数组的长度创建线程数量
            new Thread(new Print2(i)).start();
        }
    }
    private static class Print2 implements Runnable{
        private int idx;
        private static String[] ARRAY = {"A","B","C"};
        private static int INDEX;

        public Print2(int idx) {
            this.idx= idx;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i< 10 ;i++){
                    synchronized (ARRAY) {
                        while (idx != INDEX) {
                            ARRAY.wait();//如果idx和数组下标不相同,线程等待
                        }
                        System.out.print(ARRAY[idx]);
                        if (INDEX == ARRAY.length -1)//打印一遍进行换行
                            System.out.println();
                        INDEX =(INDEX+1) %ARRAY.length;//打印一次数组下标加一
                        ARRAY.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
