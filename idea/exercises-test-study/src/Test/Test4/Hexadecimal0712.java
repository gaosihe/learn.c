package Test.Test4;

import java.util.Scanner;

public class Hexadecimal0712 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            int num = 0;
            int size = c.length;
            for(int i = size-1;i>0;i--){
                int a;
                if(c[i]>=49&&c[i]<=57){
                    a = c[i]-48;
                    num+=a*Math.pow(16,size-(i+1));
                }else if(c[i]=='A'){
                    a = 10;
                    num+=a*Math.pow(16,size-(i+1));
                }else if(c[i]=='B'){
                    a = 11;
                    num+=a*Math.pow(16,size-(i+1));
                }else if(c[i]=='C'){
                    a = 12;
                    num+=a*Math.pow(16,size-(i+1));
                }else if(c[i]=='D'){
                    a = 13;
                    num+=a*Math.pow(16,size-(i+1));
                }else if(c[i]=='E'){
                    a = 14;
                    num+=a*Math.pow(16,size-(i+1));
                }else if(c[i]=='F'){
                    a = 15;
                    num+=a*Math.pow(16,size-(i+1));
                }
            }
            System.out.println(num);
        }
    }
}
