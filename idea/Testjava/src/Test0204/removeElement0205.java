package Test0204;

public class removeElement0205 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
//        removeElement(nums,3);
//        for (int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
        searchInsert(nums,5);
        System.out.println(searchInsert(nums,5));
    }

    public static int removeElement(int[] nums,int val) {//给定一个数组 nums 和一个值 val ，
        // 你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度
        int res=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){

            }else {
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
        public static int searchInsert(int[] nums, int target) {//给定一个排序数组和一个目标值，
        // 在数组中找到目标值，并返回其索引
            int res=0,res1=0,i=0;
            for(i=0;i<nums.length;i++){
                if(nums[i]<target){
                    res1++;
                    res++;
                }else if(nums[i]>target){
                    res++;
                }
                else if(nums[i]==target){
                    return res;
                }
            }
            return res1;
        }
    }
