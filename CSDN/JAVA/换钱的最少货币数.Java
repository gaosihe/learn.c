import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int  n = sc.nextInt();
            int  m = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(process(arr,n,m));
        }
    }
    public static int process(int[] arr, int N, int aim) {
        int[] dp = new int[aim + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = N - 1; i >= 0; i--) {
            for (int rest = 0; rest <= aim; rest++) {
                if (rest - arr[i] >= 0 && dp[rest - arr[i]] != -1) {
                    if (dp[rest] != -1) {
                        dp[rest] = Math.min(dp[rest], dp[rest - arr[i]] + 1);
                    } else {
                        dp[rest] = dp[rest - arr[i]] + 1;
                    }
                }
            }
        }
        return dp[aim];
    }
}