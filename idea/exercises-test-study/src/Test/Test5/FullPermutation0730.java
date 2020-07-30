package Test.Test5;

public class FullPermutation0730 {
    public static void main(String[] args) {
        int n = 20;
        int arr[] = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = i+1;
        }
        Permuta(arr,0,arr.length-1);
    }

    private static void Permuta(int[] arr, int start, int end) {
        if (start ==end){
            for(int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for (int i = start ;i<=end;i++){
            swap(arr,i,start);
            Permuta(arr,start+1,end);
            swap(arr,i,start);
        }
    }

    private static void swap(int[] arr, int i, int start) {
        int temp = arr[i];
        arr[i] =arr[start];
        arr[start] = temp;
    }


}
