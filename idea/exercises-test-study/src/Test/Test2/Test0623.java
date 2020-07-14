package Test.Test2;

public class Test0623 {
    public static void main(String[] args) {
        int[] arr ={1,3,2,2,4,4,4,4,4,4,4,2};
        int a = arr.length;
        System.out.println(getValue(arr,a));
    }
    public static int getValue(int[] gifts, int n) {
        // write code here
        int[] arr1 = new int[n];
        for (int i = 0;i<n;i++){
            arr1[gifts[i]]++;
        }
        double a1 = n/2;
        for (int i = 0 ;i<arr1.length;i++){
            if (arr1[i]>a1){
                return i;
            }
        }
        return 0;
    }
}
