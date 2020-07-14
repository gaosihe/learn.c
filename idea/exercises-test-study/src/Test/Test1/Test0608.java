package Test.Test1;

import java.util.Scanner;

public class Test0608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1=0,y2=0,y3 = 0,y4=0;
        float a,b,c;
        while (sc.hasNextInt()){
            y1=sc.nextInt();
            y2=sc.nextInt();
            y3=sc.nextInt();
            y4=sc.nextInt();
        }
        a = (y1+y3)/2;
        b = (y2+y4)/2;
        c = (y4-y2)/2;
        if((a-((y1+y3)/2))!=0){
            System.out.print("No");
            return ;
        }
        if((b-((y3-y1)/2)!=0)||(b!=((y2+y4)/2))){
            System.out.print("No");
            return ;
        }
        if((c-((y4-y2)/2))!=0){
            System.out.print("No");
            return ;
        }
        //满足所有的约束条件，输出解。
        System.out.print((int)a+" "+(int)b+" "+(int)c);
    }
}
