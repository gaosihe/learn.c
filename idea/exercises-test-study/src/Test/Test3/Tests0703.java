package Test.Test3;

import java.util.Scanner;

public class Tests0703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String password = sc.nextLine();
            if (verifyPassword(password)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    private static boolean verifyPassword(String password) {
        if (password == null||password.length()<=8){
            return false;
        }
        if (cheakCharTypes(password)&&cheakRepeatSubstring(password)){
            return true;
        }
        return false;
    }

    private static boolean cheakRepeatSubstring(String password) {
        for (int i = 0; i < password.length() - 3; i++) {
            String s = password.substring(i, i + 3);
            String tempStr = password.substring(i + 3,password.length());
            if (tempStr.contains(s)) {
                return false;
            }
        }
        return true;
    }

    private static boolean cheakCharTypes(String password) {
        int upperCase = 0, lowerCase = 0, digit = 0, other = 0;

        for (Character ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCase = 1;
            } else if (Character.isLowerCase(ch)) {
                lowerCase = 1;
            } else if (Character.isDigit(ch)) {
                digit = 1;
            } else {
                other = 1;
            }
        }
        // for (Character ch : password.toCharArray()) {
        //     if (ch >= 'A' && ch <= 'Z') {
        //         upperCase = 1;
        //     } else if (ch >= 'a' && ch <= 'z') {
        //         lowerCase = 1;
        //     } else if (ch >= '0' && ch <= '9') {
        //         digit = 1;
        //     } else {
        //         other = 1;
        //     }
        // }

        if (upperCase + lowerCase + digit + other >= 3) {
            return true;
        }
        return false;
    }
}
