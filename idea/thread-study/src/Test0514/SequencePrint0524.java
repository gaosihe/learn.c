package Test0514;

public class SequencePrint0524 {
    public static int[] arr = new int[3];
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i < 3;i++){
           Thread t = new Thread(()-> {
               synchronized (SequencePrint0524.class) {
                       if (arr[0] == 0) {
                           System.out.println("A");
                           arr[0] = 1;
                       } else if (arr[1] == 0) {
                           System.out.println("B");
                           arr[1] = 1;
                       } else if (arr[2] == 0) {
                           System.out.println("C");
                           arr[2] = 1;
                       }
               }
            });
           Thread.sleep(200);
           t.start();
        }
    }
}
