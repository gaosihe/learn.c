package Test.Test4;

import java.util.Scanner;

public class Reversed_order0716 {
    public static void main(String[] args){//句子逆序
        Scanner  sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            for(int i = s1.length-1;i>0;i--){
                System.out.print(s1[i]+" ");
            }
            System.out.print(s1[0]);
        }
    }
}
