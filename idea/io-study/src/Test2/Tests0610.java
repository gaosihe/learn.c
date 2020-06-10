package Test2;

import java.util.Scanner;

public class Tests0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int x = jiechrn(n);
            int count = 0;
            while (x>9){
                if (x%10 == 0){
                    count++;
                    x/=10;
                    continue;
                }
                x/=10;
            }
            System.out.println(count);
        }
    }

    private static int jiechrn(int n) {
        if (n == 1){
            return n;
        }
        if (n==2){
            return n;
        }
        return n*jiechrn(n-1);
    }
}
