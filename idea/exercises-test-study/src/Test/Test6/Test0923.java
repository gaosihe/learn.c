package Test.Test6;

import java.util.Scanner;

/**
 * 7
 * a b c d e f g
 * b d a c f g e
 */
public class Test0923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            String[] A = new String[m];
            String[] B = new String[m];
            for (int i = 0; i<m;i++){
               A[i] = sc.next();
            }
            for (int i = 0; i<m;i++){
                B[i] = sc.next();
            }
            int indexA = 0;
            int indexB = 0;
            int k = 0;
            int num = 0;
            for (;indexA<B.length;indexA++){
                for (indexB = k;indexB<A.length;indexB++)
                if (B[indexA].equals(A[indexB])){
                    k=indexA;
                    num++;
                    break;
                }
            }
            sc.close();
            System.out.println(num);
        }
    }
}
