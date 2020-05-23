package Test0514;

public class SignalTest0523 {
    public static int SUM;

    public static void main(String[] args) {
        //5个面包师傅,同时启动
        for(int i = 0;i<5 ; i++){
            new Thread(()->{
                try {
                    while(true){
                        synchronized (SignalTest0523.class){
                            if(SUM + 3>100){
                                SignalTest0523.class.wait();
                            }else{
                                SUM += 3;
                                System.out.println(Thread.currentThread().getName()+"生产面包 库存"+SUM);
                                Thread.sleep(500);
                                SignalTest0523.class.notify();
                                //SignalTest0523.class.notifyAll();
                            }
                        }
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"面包师傅"+i).start();
        }
        //20个消费者同时进行
        for(int i = 0;i<20 ; i++){
            new Thread(()->{
                try {
                    while(true){
                        synchronized (SignalTest0523.class){
                            if(SUM == 0){
                                SignalTest0523.class.wait();
                            }else{
                                SUM --;
                                System.out.println(Thread.currentThread().getName()+"消费面包 库存"+SUM);
                                Thread.sleep(500);
                                SignalTest0523.class.notify();
                                //SignalTest0523.class.notifyAll();
                            }
                        }
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"消费者"+i).start();
        }
    }
}
