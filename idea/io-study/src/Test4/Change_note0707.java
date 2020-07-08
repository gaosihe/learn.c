package Test4;

import java.util.Scanner;

public class Change_note0707 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] s = sc.nextLine().split(" ");
            String[] s1 = s[0].split("[.]");
            String[] s2 = s[1].split("[.]");
            int[] a = new int[3];
            int[] b = new int[3];
            int[] c = new int[3];
            for(int i=0;i<3;i++) {
                a[i] = Integer.parseInt(s1[i]);
                b[i] = Integer.parseInt(s2[i]);
            }
            if(a[0]*17*29+a[1]*29+a[2]>b[0]*17*29+b[1]*29+b[2]) {
                System.out.print("-");
                if(a[2]<b[2]) {
                    a[2]+=29;
                    a[1]-=1;
                }
                c[2]=a[2]-b[2];

                if(a[1]<b[1]) {
                    a[1]+=17;
                    a[0]-=1;
                }
                c[1]=a[1]-b[1];
                c[0]=a[0]-b[0];
            }
            else {
                if(b[2]<a[2]) {
                    b[2]+=29;
                    b[1]-=1;
                }
                c[2]=b[2]-a[2];

                if(b[1]<a[1]) {
                    b[1]+=17;
                    b[0]-=1;
                }
                c[1]=b[1]-a[1];
                c[0]=b[0]-a[0];
            }
            System.out.print(c[0]+"."+c[1]+"."+c[2]);
        }
}
