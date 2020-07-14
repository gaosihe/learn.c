package Test.Test1;

public class Finder0603 {

    public static void main(String[] args) {
        int[] arr={2,7,4,8,9,3,6,1,5};
        int a=findKth(arr,9,4);
        System.out.println(a);

    }
    public static int findKth(int[] a, int n, int K) {
        return quickSort(a,0,n-1,K);
        // write code here
    }

    private static int quickSort(int[] arr, int low, int high, int k) {
        int p = partion(arr,low,high);//p就是返回的本数组第p+1大的数
        if (k == p-low+1){//k==p-low+1的话,下标为p的数就是整个数组中第k大的数
            return arr[p];
        }else if(p-low+1 >k){//向左递归
            return quickSort(arr,low,p-1,k);
        }else {//向右递归
            return quickSort(arr,p+1,high,k-(p-low+1));
        }
    }

    private static int partion(int[] arr, int low, int high) {//快速排序
        int tmp = arr[low];
        while (low < high ){
            while (low  < high && arr[high]<= tmp){
                high--;
            }
            if(low == high){
                break;
            }else{
                arr[low] = arr[high];
            }
            while (low< high&&arr[low]>= tmp){
                low++;
            }
            if (low == high){
                break;
            }else{
                arr[high] = arr[low];
            }
        }
        arr[low] = tmp  ;
        return low;
    }

}