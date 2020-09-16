package Test.Test6;

import java.util.Scanner;

public class AddNumGame0913 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[n];
            in.nextLine();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
//        System.out.println(Arrays.toString(arr));

            int count = 0;
            for (int i = 0; i <= n-m; i++) {
                boolean flag = true;
                    if(!(helper(arr,i,m,k))){
                        flag = false;
                    }
                if(flag){
                    count++;
                }

            }
            System.out.println(count);
        }

    private static boolean helper(int[] arr, int i, int j, int k) {
            for (int a = i;a<i+j;a++){
                if(arr[a]<k){
                    return false;
                }
            }
            return true;
    }

}
