package Test.Test3;

import java.util.Scanner;

public class Test0628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] arr=new int[n];
            for(int i = 0 ;i< n ;i++){
                arr[i]=sc.nextInt();
            }
            for(int i = 0 ;i< n ;i++){
                if (arr[i]<= a){
                    a+=arr[i];
                }else {
                    a+=helper(a,arr[i]);
                }
            }
                System.out.println(a);
        }
    }

    private static int helper(int b, int a) {
        while(a%b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return b;
    }
}
