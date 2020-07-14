package Test.Test1;

import java.util.Scanner;

public class Test0603 {//输出一个数字,表示把a字符串插入b字符串之后构成回文串的方法数
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String a = sc.nextLine();
            int count =0;
            for (int i = 0;i<s.length()+1;i++){
                StringBuilder sb = new StringBuilder(s);
                sb.insert(i,a);
                if (islevel(sb.toString())){
                    count++;
                }
            }
            System.out.println(count);
        }
    public static boolean islevel(String s){
        int top = 0;
        int end = s.length()-1;
        if(s.equals("")||s.equals(null)) return false;
        while(top<end){
            if (s.charAt(top++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
