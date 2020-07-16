package Test.Test4;

import java.util.Scanner;

public class Delete_characters0716 {
    public static void main(String[] args) {//删除公共字符
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        String s = sc.nextLine();
        for(int i = 0 ;i<a.length;i++){
            if (!s.contains(String.valueOf(a[i]))){
                System.out.print(a[i]);
            }
        }
    }
}
