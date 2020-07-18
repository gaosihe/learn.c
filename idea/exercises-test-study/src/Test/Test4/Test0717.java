package Test.Test4;

import java.util.Scanner;

public class Test0717 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] s1 = sc.nextLine().split(";");
            int a=0,b=0;
            for(String s : s1 ){
                char[] s2 = s.toCharArray();
                if(s2.length==3&&s2[1]>='0' &&s2[1]<='9' &&s2[2]>='0' &&s2[2]<='9'){
                    int x = Integer.parseInt(String.valueOf(s2[1]))*10+Integer.parseInt(String.valueOf(s2[2]));
                    if(s2[0]=='A'){
                        a-=x;
                    }else if(s2[0]=='D'){
                        a+=x;
                    }else if(s2[0]=='W'){
                        b+=x;
                    }else if(s2[0]=='S'){
                        b-=x;
                    }
                }
            }
            System.out.println(a+","+b);
        }
}
