package Test3;

import java.util.Scanner;

public class Test0702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            for (int i = 0;i<n;i++){
                if (arr[i]==x){
                    System.out.println(i);
                }
            }
            System.out.println(-1);
        }
    }
}
