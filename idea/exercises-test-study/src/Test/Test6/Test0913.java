package Test.Test6;

import java.util.Scanner;

public class Test0913 {
    public static void main(String[] args) {
        juzheng();
    }

    private static void juzheng() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int start = 0;
        int end = m-1;
        int[][] arr = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j= 0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }
        boolean sag = false;
        while (end>1) {
            int mid = (end+1)/2;
            while (start < end) {
                if (helper(arr,start,end)) {
                    start++;
                    end--;
                } else {
                    sag = true;
                    break;
                }
            }
            if (sag){
                break;
            }
            start = 0;
            end = mid-1;
        }
            for (int i = 0;i<=end;i++){
                for (int j = 0;j<n-1;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println(arr[i][n-1]);
            }
    }

    private static boolean helper(int[][] arr, int start, int end) {
        int size = arr[start].length;
        for (int i = 0;i<size;i++){
            if( arr[start][i]!=arr[end][i]){
                return false;
            }
        }
        return true;
    }
}
