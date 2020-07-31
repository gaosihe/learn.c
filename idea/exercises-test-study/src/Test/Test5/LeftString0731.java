package Test.Test5;

public class LeftString0731 {
    public static void main(String[] args) {
        String s = "abc123";
        System.out.println(LeftRotateString(s,124 ));
    }

    public static void Reverse(char[] list, int start, int end){
        while(start < end){
            char temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;
        }
    }
    public static String LeftRotateString(String str,int n) {
        if(str.length() == 0 || n == 0){
            return str;
        } n%= str.length();
        char[] list = str.toCharArray();
        Reverse(list, 0, n-1);
        Reverse(list, n, str.length()-1);
        Reverse(list, 0, str.length()-1);
        return new String(list);
    }

}
