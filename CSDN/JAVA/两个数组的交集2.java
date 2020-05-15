
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {//两个数组的交集2
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums1){
            map.put(n,map.getOrDefault(n,0)+1);//保存数组元素出现的个数
        }
        int [] nums =new int[nums1.length];
        int k = 0;
        for(int n :nums2){
            int a = map.getOrDefault(n,0);
            if(a>0){//如果n的值在另一个数组中存在
                nums[k++]=n;//则保存至新数组
                map.put(n,map.getOrDefault(n,0)-1);//将另一个数组的元素储存个数减一
            }
        }
        return Arrays.copyOfRange(nums, 0, k);
    }
}
