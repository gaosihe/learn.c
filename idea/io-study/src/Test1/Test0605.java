package Test1;

import java.util.Scanner;

public class Test0605 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }

    private static int count(int n) {
        if (n%2!=0||n==10||n<6) return -1;
        if (n%8 == 0) return n/8;
        return 1+n/8;
    }
}