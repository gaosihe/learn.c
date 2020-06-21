package Test2;

import java.util.Scanner;

public class Test0621 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {
//            String sb =  in.nextLine();
//            int n= in.nextInt();
//            int start =0 ;
//            int max =0 ;
//            for(int  i= 0 ;i<sb.length()-n;i++){
//                int count = 0;
//                for (int j = i;j<i+n;j++){
//                    if (sb.charAt(j) == 'G' || sb.charAt(j) == 'C') {
//                        count++;
//                    }
//                    if(count>max){
//                        max=count;
//                        start = i;
//                    }
//                }
//            }
//            for (int i = start;i<start+n;i++){
//                System.out.println(sb.charAt(i));
//            }
//        }
        int a = 10*30;
        long b = 0;
        long c = 1;
        for(int i =0;i<30;i++){
            b+=c;
            c*=2;
        }
        System.out.println(a+" "+b);
    }
}
