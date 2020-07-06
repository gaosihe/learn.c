package Test4;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Fanhua0706 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" +");
        for(int i = s1.length-1;i>=0;--i){
            System.out.print(s1[i]);
            if(i!=0)
                System.out.print(" ");
        }
    }
}
