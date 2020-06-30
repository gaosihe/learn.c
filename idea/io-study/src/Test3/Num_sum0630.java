package Test3;

import java.util.Scanner;

public class Num_sum0630 {
    private static int num;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int count= n*n;
            int n1 = helper(count);
            num = 0;
            int n2 = helper(n);
            num = 0;
            System.out.println(n2+" "+n1);
        }
    }

    private static int helper(int n) {
        int x = n;
        while (n>9){
            x = n%10;
            num+=x;
            return helper(n/10);
        }
        num+=x;
        return num;
    }
}
