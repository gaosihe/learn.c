package Test2;

import java.util.Scanner;

public class Test0613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNextInt()) {
            n = sc.nextInt();

            int a1[] = anwei(n);
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != 0) {
                    System.out.println(i + ":" + a1[i]);
                }
            }
        }
    }

    private static int[] anwei(int n) {
        int arr[] = new int[10];
        while (n>9){
            int k = 0;
            k = n%10;
            arr[k]++;
            n/=10;
        }
        arr[n]++;
        return arr;
    }

}
