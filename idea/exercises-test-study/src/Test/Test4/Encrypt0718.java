package Test.Test4;

import java.util.Scanner;

public class Encrypt0718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jia = sc.nextLine();
        String jie = sc.nextLine();
        encryer(jia);
        upencryer(jie);
    }

    private static void upencryer(String jie) {
        char[] chars = jie.toCharArray();
        for (char a:chars){
            if (a>=66&&a<=90){
                a+=31;
                System.out.print(a);
            }else if(a==65){
                a=122;
                System.out.print(a);
            }else if(a>=98&&a<=122){
                a-=33;
                System.out.print(a);
            }else if(a==97){
                a=90;
                System.out.print(a);
            }else if(a<=57&&a>=49){
                a-=1;
                System.out.print(a);
            }else if(a==48){
                a=57;
                System.out.print(a);
            }
        }
    }

    private static void encryer(String jia) {
        char[] chars = jia.toCharArray();
        for (char a:chars){
            if (a>=65&&a<=89){
                a+=33;
                System.out.print(a);
            }else if(a==90){
                a=97;
                System.out.print(a);
            }else if(a>=97&&a<=121){
                a-=31;
                System.out.print(a);
            }else if(a==122){
                a=65;
                System.out.print(a);
            }else if(a<=56&&a>=48){
                a+=1;
                System.out.print(a);
            }else if(a==57){
                a=48;
                System.out.print(a);
            }
        }System.out.println();
    }
}
