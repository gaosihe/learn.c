package Test.Test3;

import java.util.Scanner;

public class Test0703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n =sc.nextInt();
            int N_2 = n*n;
            int count =0;
            int num = n;
            while (num>9){
                num = num/10;
                count++;
            }
            count++;
            int a = N_2-n;
            int count1 = 0;
            while (a>9&&a%10==0){
                a=a/10;
                count1++;
            }
            if (count==count1){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}
