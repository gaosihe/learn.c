package Test.Test4;

import java.util.Scanner;
public class Year0718  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int y = in.nextInt();
            int r = in.nextInt();

            System.out.println(getDay(n,y,r));
        }
    }
    public static int getDay(int n,int y,int r){
        int s = 0,temp = 0;
        if(n%4==0&&n%100!=0||n%400==0){
            s = 1;
        }
        int[] lemp={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<y-1;i++){
            temp+=lemp[i];
        }
        return temp+r+s;
    }
}