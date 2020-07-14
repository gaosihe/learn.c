package Test.Test2;

import java.util.Scanner;

public class Test0617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int[] count = new int[20];
      for (int i = 0;i<10 ;i++){
          count[i] = sc.nextInt();
      }
      for (int i = 1;i<10;i++){
          if (count[i]>0){
              System.out.print(i);
              count[i]--;
              break;
          }
      }
        for (int i = 0;i<10;i++){
            while (count[i]>0){
                System.out.print(i);
                count[i]--;
            }
        }
    }
}
