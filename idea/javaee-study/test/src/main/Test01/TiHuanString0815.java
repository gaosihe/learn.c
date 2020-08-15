package main.Test01;

public class TiHuanString0815 {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer s = new StringBuffer("");
        String s1 =str.toString();
        String[] s2 = s1.split("");
        for(String c : s2) {
            if (c.equals(" ")) {
                s.append("%20");
            }else {
                s.append(c);
            }
        }
        return s.toString();
    }
}