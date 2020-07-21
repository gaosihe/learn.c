package Test.Test5;

import java.util.Scanner;

public class TheWordInverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            //将字符串转化为字符数组
            char[] temp = str.toCharArray();
            //定义StringBuilder对象，对字符串进行修改
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.length; i++) {
                if((temp[i] >= 'a' && temp[i] <= 'z') || (temp[i] >= 'A' && temp[i] <= 'Z')){
                    //为26个英文字符，加入到sb中
                    sb.append(temp[i]);
                }else{
                    //为其他字符，加入空格到sb中
                    sb.append(" ");
                }
            }
            String str2 = sb.toString();
            //去掉str2两边的空格
            str2 = str2.trim();
            //将字符串str2以一个空格或者多个空格进行分割，正则表达式—  \\s:代表空格，\\s+:代表[1,n]空格
            String[] temp1 = str2.split("\\s+");
            //倒着打印temp即可
            for (int j = temp1.length - 1; j >= 0; j--) {
                System.out.print(temp1[j] + " ");
            }
            System.out.println();
        }
    }
}