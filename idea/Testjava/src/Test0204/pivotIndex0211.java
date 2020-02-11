package Test0204;

public class pivotIndex0211 {
    public static void main(String[] args) {
        int[] a={1,3,2,1,4,7};
        System.out.println(pivotIndex(a));
        for(int i=0;i<a.length;i++)
        System.out.print(sortArrayByParity(a)[i]+" ");
    }
        public static int pivotIndex(int[] nums) {//寻找数组的中心索引
            int ans = -1;
            int leftsum = 0;
            int rightsum = 0;
            for (int i = 0; i < nums.length; i++) rightsum += nums[i];
            for (int i = 0; i < nums.length; i++) {
                rightsum -= nums[i];
                if (leftsum == rightsum) {
                    ans = i;
                    break;
                } else {
                    leftsum += nums[i];
                }
            }
            return ans;
        }
        public static int[] sortArrayByParity(int[] A) {//按奇偶排序数组
            int[] arr1=new int[A.length];
            int num1=0,num2=arr1.length-1;
            for(int i=0;i<A.length;i++){
                if(A[i]%2==0)
                    arr1[num1++]=A[i];
                else
                    arr1[num2--]=A[i];
            }
            return arr1;
        }
}
