package String0318;

public class String0318 {
    public static void main(String[] args) {
        String str="Hello World";
        indexOf(str);
        replace(str);
        contains(str);
        compareTo(str);
    }

    public static void indexOf(String str) {
        String str1="orl";
        String str2="l";
        System.out.println(str.indexOf(str1));
    }
    public static void replace(String str) {
        String str1="orl";
        String str2="l";
        System.out.println(str.replaceAll(str1,str2));
    }
    public static void contains(String str) {
        String str1="orl";
        System.out.println(str.contains(str1));
    }
    public static void compareTo(String str) {
        String str1="orl";
        String str2="l";
        System.out.println(str.compareTo(str2));
    }
}
