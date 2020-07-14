package Test.Test4;

import java.util.Scanner;
public class Jock0708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr1 = new int[3];//记录第一个人胜平负的次数
            int[] arr2 = new int[3];//记录第二个人胜平负的次数
            int[] jcb1 = new int[3];//两个数组记录两个人获胜情况,依次是剪刀石头步,这样也正好是字符大小的次序
            int[] jcb2 = new int[3];
            sc.nextLine();
            while (n-- > 0) {
                String s = sc.nextLine();
                String[] s1 = s.split(" ");
                if (s1[0].equals("C") && s1[1].equals("C") || s1[0].equals("J") && s1[1].equals("J") || s1[0].equals("B") && s1[1].equals("B")) {
                    arr1[1]++;
                    arr2[1]++;
                } else if (s1[0].equals("C") && s1[1].equals("J") || s1[0].equals("J") && s1[1].equals("B") || s1[0].equals("B") && s1[1].equals("C")) {
                    arr1[0]++;
                    arr2[2]++;
                    if (s1[0].equals("C")) {
                        jcb1[1]++;
                    } else if (s1[0].equals("J")) {
                        jcb1[0]++;
                    } else if (s1[0].equals("B")) {
                        jcb1[2]++;
                    }
                } else if (s1[0].equals("J") && s1[1].equals("C") || s1[0].equals("B") && s1[1].equals("J") || s1[0].equals("C") && s1[1].equals("B")) {
                    arr1[2]++;
                    arr2[0]++;
                    if (s1[1].equals("C")) {
                        jcb2[1]++;
                    } else if (s1[1].equals("J")) {
                        jcb2[0]++;
                    } else if (s1[1].equals("B")) {
                        jcb2[2]++;
                    }
                }
            }
            System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
            System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);
            int num1 = helper(jcb1);
            int num2 = helper(jcb2);
            if (num1 == 0) {
                System.out.print("J" + " ");
            } else if (num1 == 1) {
                System.out.print("C" + " ");
            } else if (num1 == 2) {
                System.out.print("B" + " ");
            }
            if (num2 == 0) {
                System.out.print("J");
            } else if (num2 == 1) {
                System.out.print("C");
            } else if (num2 == 2) {
                System.out.print("B");
            }
        }
    }
    public static int helper(int[] arr){//找出最大的获胜情况
        int tmp = 0;
        int num = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=tmp){
                num = i;
                tmp = arr[i];
            }
        }
        return num;
    }
}
