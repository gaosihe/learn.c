package Test3;

import java.util.Scanner;

public class num0703 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int sum = in.nextInt();
                int[] arr = new int[n + 1];
                long[][] dp = new long[n + 1][sum + 1];
                for (int i = 0; i <= n;i++){
                    dp[i][0] = 1;
                }
                for (int j = 1; j <= sum; j++){
                    dp[0][j] = 0;
                }
                for (int i = 1; i <= n; i++){
                    arr[i] = in.nextInt();
                    for (int j = 0; j <= sum; j++){
                        if (j >= arr[i])
                            dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i]];
                        else
                            dp[i][j] = dp[i - 1][j];
                    }
                }

                System.out.println(dp[n][sum]);
    }
}