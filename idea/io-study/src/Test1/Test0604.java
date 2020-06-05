package Test1;

import java.util.Scanner;

public class Test0604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MixString(s));
    }

    private static String MixString(String s) {
        StringBuffer sb = new StringBuffer();
        for (char a: s.toCharArray()){
            if(a >= '0'&&a <= '9'){
                sb.append(a);
            }else {
                sb.append(" ");
            }
        }
        String str = sb.toString();
        //将str以一个或者多个空格切割,存到nums中;
        String[] nums = str.split("\\s+");
        int max = 0;
        for (int i = 0; i<nums.length;i++){
            max = nums[i].length()>max ? nums[i].length():max;
        }
        int i;
        for (i = 0; i<nums.length;i++){
            if(max == nums[i].length()){
                break;
            }
        }
        return nums[i];
    }
}
