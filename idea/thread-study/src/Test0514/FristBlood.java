package Test0514;

public class FristBlood {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(99999999999L);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"第一滴血").start();
        //Thread.sleep(99999999999L);
    }
}
