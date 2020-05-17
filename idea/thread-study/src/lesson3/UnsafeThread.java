package lesson3;

public class UnsafeThread {
    private static int SUM;

    public static void main(String[] args) {
        for (int i = 0; i<20; i++ ){
            new Thread(()->{
                for (int j=0;j<10000;j++){
                    SUM++;
                }
            }).start();
        }
        while (Thread.activeCount()>1){//idea使用debug运行,
            Thread.yield();
        }
        System.out.println(SUM);
    }
}
