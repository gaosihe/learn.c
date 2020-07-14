package Test.Test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tests0624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = helper(s,s1);
        System.out.println(s2);
    }

    private static String helper(String s, String s1) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuffer sb = new StringBuffer();
        boolean tag = false;
        for (char x : s1.toCharArray()){
            if (map.containsKey(x)){
                int num = map.get(x);
                if (num-1 == 0){
                    map.remove(x);
                }else {
                    map.put(x,num-1);
                }
                continue;
            }
            sb.append(x);
            tag = true;
        }
        if (tag){
            return "No"+sb.length();
        }
        return "Yes"+map.size();
    }
}
