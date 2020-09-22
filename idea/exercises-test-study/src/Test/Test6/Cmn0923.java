package Test.Test6;

import java.util.Scanner;

public class Cmn0923 {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            long count = m>n?fact(m)/(fact(m-n)*fact(n)):0;
            System.out.println(count);
        }
    }
    public static long fact(int a){
        long sum= 1;
        while (a>0){
            sum = sum*a--;
        }
        return sum;
    }
}
