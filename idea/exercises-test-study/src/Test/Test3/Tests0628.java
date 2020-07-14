package Test.Test3;

import java.util.Scanner;

public class Tests0628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int j = 0;
        int k = 0;
        int n = 0;
        int a = 0;
        while (sc.hasNext()){
            n = sc.nextInt();
            a = sc.nextInt();
            int[] arr=new int[n];
            for(int i = 0 ;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i = 0;sc.hasNext()&&i<a;i++){
                s = sc.nextLine();
                j = sc.nextInt();
                k = sc.nextInt();
                if (s.equals("Q")){
                    int min =Math.min(j,k);
                    int max =Math.max(j,k);
                    int num = arr[min-1];
                    for (int m= min;m< max;m++){
                        if(arr[m-1]>arr[m]){
                            num = arr[m-1];
                        }else {
                            num = arr[m];
                        }
                    }
                    System.out.println(num);
                }else if (s.equals("U")){
                    arr[j-1] = k;
                }
            }
        }
    }
}
