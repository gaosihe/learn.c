package Test4;

import java.util.Scanner;

public class Stick_puzzle0713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                int x =sc.nextInt();
                int y=sc.nextInt();
                if(x==1){
                    arr[i]=y;
                }else{
                    for(int j =0;j<arr.length;j++){
                        if(y==arr[j]){
                            arr[j]=0;
                            break;
                        }
                    }
                }
                if(pintu(arr)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
    public static boolean pintu(int[] arr){
        int count = 0;
        int max = 0,num = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]!=0){
                count++;
            }
            num+=arr[i];
        }
        if(count<3)
            return false;
        return num-max>max?true:false;
    }
}
