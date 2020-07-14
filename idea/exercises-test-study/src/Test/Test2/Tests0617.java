package Test.Test2;

import java.util.Scanner;

public class Tests0617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        sc.close();
        int n =input*input*input;
        System.out.println(getString(n,input));
    }

    private static String getString(int n, int input) {
        int flag = 0;
        outer:
        for (int i = 1;i<=n;i++){
            int temp = i;
            int sum = 0;
            flag = temp;
            for (int j = 0;j <input;j++){
                sum += temp;
                if (sum==n){
                    break outer;
                }
                temp+=2;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<input;i++){
            if (i<input - 1){
                stringBuffer.append(flag).append("+");
                flag+=2;
            }
        }
        stringBuffer.append(flag);
        return stringBuffer.toString();
    }
}
