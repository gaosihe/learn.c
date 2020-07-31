package Test.Test5;

public class Stringleft0731 {
    public static void main(String[] args) {
        String s = "abc123";
        System.out.println(LeftRotateString(s,122 ));
    }

    private static String LeftRotateString(String str,int n) {
        if (str.length() == 0||n == 0){
            return str;
        }
        n%= str.length();
        for (int i =0 ;i<n;i++){
            str = LeftRotateStr(str);
        }
        return str;
    }

    private static String LeftRotateStr(String str) {
        String[] s = str.split("");
        String s1 = "";
        String c = s[0];
        int len  = s.length;
        for (int i = 0;i<len-1;i++){
            s1+= s[i+1];
        }
        s1+= c;
        return s1;
    }
}
