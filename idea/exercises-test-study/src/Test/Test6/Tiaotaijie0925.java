package Test.Test6;

import java.util.*;
public class Tiaotaijie0925 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = 2;
            for(int i = 0;i<a-2;i++){
                b*=2;
            }
            System.out.println(b);
        }
    }
}