package Test3;

import java.util.Scanner;

public class TestIP0702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String ip = scanner.nextLine();
            String ip10=scanner.nextLine();
            convertToIp10(ip);
            convertToIp(ip10);
        }
    }

    private static void convertToIp(String ip10) {
        String bin = Long.toBinaryString(Long.parseLong(ip10)); //长整型整数转为二进制
        if (bin.length() < 32) {
            int diff = 32 - bin.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < diff; i++) {
                sb.append("0");
            }
            bin = sb.toString() + bin;
        }
        String[] four = new String[4];
        four[0] = bin.substring(0, 8);  //取得每个部分
        four[1] = bin.substring(8, 16);
        four[2] = bin.substring(16, 24);
        four[3] = bin.substring(24, 32);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            s.append(Integer.parseInt(four[i], 2));
            if (i != 3) {
                s.append(".");
            }
        }
        System.out.println(s.toString());
    }

    private static void convertToIp10(String ip) {
        String[] s = ip.split("\\.");
        StringBuffer sb= new StringBuffer();
        for (int i = 0; i < 4;i++){
            String t = Integer.toBinaryString(Integer.parseInt(s[i]));
            if (t.length()<8){
                int diff = 8- t.length();
                StringBuilder sx = new StringBuilder();
                for (int j = 0;j<diff;j++){
                    sx.append("0");
                }
                t = sx.toString()+t;
            }
            sb.append(t);
        }
        long res = Long.parseLong(sb.toString(),2);
        System.out.println(res);
    }
}
