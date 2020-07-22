package Test.Test5;

import java.util.HashMap;
import java.util.Scanner;

public class PingPang0722 {
    // write your code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            String[] sA = str[0].split("");
            String[] sB = str[1].split("");
            HashMap<String,Integer> mapA = new HashMap<>();
            HashMap<String,Integer> mapB = new HashMap<>();
            for (String s1:sA){
                if (!mapA.containsKey(s1)){
                    mapA.put(s1,1);
                }else {
                    mapA.put(s1,mapA.get(s1)+1);
                }
            }
            for (String s1:sB){
                if (!mapB.containsKey(s1)){
                    mapB.put(s1,1);
                }else {
                    mapB.put(s1,mapB.get(s1)+1);
                }
            }
            int count=0;
            for (int i = 0;i<sB.length;i++){
                if (mapA.containsKey(sB[i])){
                    mapA.put(sB[i],mapA.get(sB[i])-1);
                    if (mapA.get(sB[i])<0){
                        System.out.println("No");
                        break;
                    }
                    count++;
                }else {
                    System.out.println("No");
                    break;
                }
            }
            if (count==sB.length){
                System.out.println("Yes");
            }
        }
    }
}
