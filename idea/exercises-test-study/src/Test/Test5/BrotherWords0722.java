package Test.Test5;

import java.util.Arrays;
import java.util.Scanner;
public class BrotherWords0722 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            String[] xd = new String[n+1];
            for(int i = 0;i<n;i++){
                str[i] = sc.next();
            }
            Arrays.sort(str);
            String s = sc.next();
            int x = sc.nextInt();
            int count =0,k=1;
            boolean ist = false;
            for(int i = 0;i<n;i++){
                if(!s.equals(str[i])){
                    ist = isxiongdi(s,str[i]);
                    if(ist){
                        count++;
                        xd[k++]=str[i];
                    }
                }
            }
            System.out.println(count);
            if(count >= x){
                System.out.println(xd[x]);
            }
        }
    }
    public static boolean isxiongdi(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return new String(chars1).equals(new String(chars2)) && !str1.equals(str2);
    }
}