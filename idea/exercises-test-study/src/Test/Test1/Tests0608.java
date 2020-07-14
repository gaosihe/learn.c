package Test.Test1;

import java.util.Scanner;

public class Tests0608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        String s1[] =s.split(" ");
        int[] arr1 = new int[s1.length];
        for (int i = 0;i<s1.length;i++){
            arr1[i] = Integer.parseInt(s1[i]);
        }
        int len = arr1.length/2;
        int [] a = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr1[i] == j) {
                    a[j]++;
                }
            }
        }
        int ret = 0;
        for (int j = 0; j < a.length; j++) {
            if (len <= a[j]) {
                ret = j;
            }
        }
        System.out.println(ret);
    }
}
