package Test3;

import java.util.Scanner;

public class Test0630 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            double num;
            double gpa = 0;
            int count = 0;
            for (int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
                count+=arr[i];
            }
            for (int i = 0;i<arr1.length;i++){
                //if (sc.nextInt()>=0&&sc.nextInt()<=100)
                arr1[i] = sc.nextInt();
            }
            for (int i = 0;i<arr1.length;i++){
                if (arr1[i]>=90&&arr1[i]<=100){
                    num = arr[i]*4.0;
                    gpa+=num;
                }else if (arr1[i]>=85&&arr1[i]<=89){
                    num = arr[i]*3.7;
                    gpa+=num;
                }else if (arr1[i]>=82&&arr1[i]<=84){
                    num = arr[i]*3.3;
                    gpa+=num;
                }else if (arr1[i]>=78&&arr1[i]<=81){
                    num = arr[i]*3.0;
                    gpa+=num;
                }else if (arr1[i]>=75&&arr1[i]<=77){
                    num = arr[i]*2.7;
                    gpa+=num;
                }else if (arr1[i]>=72&&arr1[i]<=74){
                    num = arr[i]*2.3;
                    gpa+=num;
                }else if (arr1[i]>=68&&arr1[i]<=71){
                    num = arr[i]*2.0;
                    gpa+=num;
                }else if (arr1[i]>=64&&arr1[i]<=67){
                    num = arr[i]*1.5;
                    gpa+=num;
                }else if (arr1[i]>=60&&arr1[i]<=63){
                    num = arr[i];
                    gpa+=num;
                }else {
                }
            }
            System.out.println(String.format("%.2f",gpa/count));

        }
    }
}
