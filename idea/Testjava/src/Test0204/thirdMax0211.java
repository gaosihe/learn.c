package Test0204;

public class thirdMax0211 {
    public static void main(String[] args) {
        int []a={2,3,1,4,5};
        System.out.println(thirdMax(a));
        plusOne(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
   }
        public static int thirdMax(int[] nums) {//第三大的数
            int max=0,count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<i;j++){
                    if(nums[j]<nums[i]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
            max=nums[0];
            for(int i=0;i<nums.length-1;i++){
                int max1=0;
                if(nums[i]>nums[i+1]){
                    count++;
                    max1=nums[i+1];
                }
                if(count==2){
                    return max1;
                }
            }
            return max;
        }
        public static int[] plusOne(int[] digits) {//数组加一
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                digits[i] = digits[i] % 10;
                if (digits[i] != 0) return digits;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
}
