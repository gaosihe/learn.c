package Test.Test4;

import java.util.Scanner;

public class Latter_stat0712 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            char[] sb= s.toCharArray();
            int[] arr = new int[91];
            for(char c:sb){
                if(c>=65&&c<=90){
                    arr[c]++;
                }
            }
            for(int i = 65;i<91;i++){
                 char c = (char) i;
                 System.out.println(c+":"+arr[i]);
            }
        }
    }
}
