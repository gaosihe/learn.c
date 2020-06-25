package Test3;

import java.util.Scanner;

public class Test0625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1||n==2)
            System.out.print(1);
        System.out.println(getCount(n));
    }
    public static int getCount(int n){
        if (n==1||n==2)
            return 1;
        return getCount(n-1)+getCount(n-1);
    }
}