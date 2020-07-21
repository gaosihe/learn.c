package Test.Test5;

import java.util.Scanner;
    public class CamelNomenclature0721{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                String sb = sc.nextLine();
                int sizeOld = sb.length();
                for(int i = 0;i<sb.length();i++){
                    int c = i;
                    if(sb.charAt(i)=='_'){
                        sb = sb.substring(0,i)+(char)(sb.charAt(i+1)-32)+sb.substring(i+2,--sizeOld+1);
                    }
                }
                System.out.println(sb);
        }
    }
}
