package Test0204;

public class searchRange0214 {
    public static void main(String[] args) {
        int [] a={2,4,5,6,6,8,8,9};
        int i=0;
        while(i<2) {
            System.out.println(searchRange(a, 8)[i]);
            i++;
        }
        System.out.println(myAtoi("  -42 wqeqwr"));
    }
        public static int[] searchRange(int[] nums, int target) {
            //在排序数组中查找元素的第一个和最后一个位置
            //找出给定目标值在排序数组中的开始位置和结束位置。
            return new int []{lefts(nums,target),rights(nums,target)};
        }
        public static int  lefts(int[] nums, int target){//找左边
            if (nums.length == 0) return -1;
            int left = 0;
            int right = nums.length; // 注意

            while (left < right) { // 注意
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid; // 注意
                }
            }
            // return left;
            // target 比所有数都大
            if (left == nums.length) return -1;
            // 类似之前算法的处理方式
            return nums[left] == target ? left : -1;
        }
    public static int rights(int[] nums, int target) {//找右边
            if (nums.length == 0) return -1;
            int left = 0, right = nums.length;

            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    left = mid + 1; // 注意
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid;
                }
            }
            //return left - 1; // 注意
            if (left == 0) return -1;
            return nums[left-1] == target ? (left-1) : -1;
        }
    public static int myAtoi(String str) {// 字符串转换整数
        int rev = 0;
        char[] charList = str.toCharArray();
        int length = str.length();
        int zf = 1;
        int i = 0;
        int pop = 0;
        for(;  i < length; i++){
            if(charList[i] == ' '){
                continue;
            }else{
                if(charList[i] == '-'){
                    i++;
                    zf = -1;
                    break;
                }
                if(charList[i] == '+'){
                    i++;
                    break;
                }
                if(charList[i] <'0' || charList[i] >'9'){
                    return 0;
                }else{
                    break;
                }
            }
        }
        if(i == length){
            return 0;
        }
        for(;i < length; i++){
            if(charList[i] <'0' || charList[i] >'9'){
                return rev;
            }
            pop = (charList[i] -48) * zf;
            if(rev>Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                return Integer.MAX_VALUE;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                return Integer.MIN_VALUE;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
