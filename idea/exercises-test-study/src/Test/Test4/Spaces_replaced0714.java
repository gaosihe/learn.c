package Test.Test4;

public class Spaces_replaced0714 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("s sgaas as"));
    }
    public static String replaceSpace(String iniString) {
        // write code here
        iniString = iniString.replaceAll(" ","%20");
        return iniString;
    }
}
