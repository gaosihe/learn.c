package Test.Test4;

import java.util.Scanner;

    public class Max_num0717 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int cur = 0,k=0;
            int[] arr = new int[n];
            int[] arr1 = new int[n*n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                int num = 0;
                for(int j = i;j<n;j++){
                    num+=arr[j];
                    if(arr[j]<0){
                        arr1[k++]=cur;
                    }
                    cur = num;
                }
                arr1[k++]=cur;
            }
            int max=0;
            for(int i = 0;i<arr1.length;i++){
                if(arr1[i]>max){
                    max=arr1[i];
                }
            }
            System.out.println(max);
        }
}
