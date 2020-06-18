package Test2;

import java.util.Scanner;

public class Test0618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            if (N == 0){
                return;
            }
            int[] arr = new int[N];
            for (int i = 0 ;i< N;i++){
                arr[i]= scanner.nextInt();
            }
            int T= scanner.nextInt();
            int count = 0;
            for (int i = 0 ; i<N ;i++){
                if (T==arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
