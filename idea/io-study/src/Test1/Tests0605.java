package Test1;

import java.util.Scanner;

public class Tests0605 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s1 = in.next();
            String s2 = in.next();
            shanchu(s1,s2);
        }

        private static void shanchu(String s1, String s2) {
            String[] arr1 =s1.split("");
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arr1.length; i++) {
                if (!s2.contains(arr1[i])){
                    sb.append(arr1[i]);
                }
            }
            System.out.println(sb.toString());
        }
}
