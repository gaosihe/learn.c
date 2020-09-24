package Test.Test6;

import java.util.Scanner;

public class Dezhoupuke0923 {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            String[] s = new String[m];
            for (int i = 0; i<m ;i++){
                s[i] = sc.next();
            }
            int count = 1;
            for (int i = 0;i<m-1;i++){
                String s1[] = s[i].split("");
                for (int j = i+1;j<m;j++) {
                    String s2[] = s[j].split("");
                    if (s1[1].equals(s2[1])){
                        count++;
                        break;
                    }
                }
            }
            int count1 = 1;
            for (int i = 0;i<m-1;i++){
                String s1[] = s[i].split("");
                for (int j = 0;j<m;j++) {
                    String s2[] = s[j].split("");
                    char a = s1[1].charAt(1);
                    char b = s2[1].charAt(1);
                    b = (char) (b+1);
                    if (a==b){
                        count++;
                        break;
                    }
                }
            }
            if (count == 1){
                if (count1 == 5){
                    System.out.println("ShunZi");
                }else {
                    System.out.println("GaoPai");
                }
            }else if (count == 2){
                System.out.println("YiDui");
            }else if (count == 3){
                System.out.println("SanTiao");
            }else if (count == 4){
                System.out.println("SiTiao");
            }else {
                System.out.println("ShunZi");
            }
        }
    }
}
