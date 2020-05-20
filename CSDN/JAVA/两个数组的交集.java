class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0||nums2==null||nums2.length==0)
        return new int[0];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        int[] res=new int[set2.size()];
        int value = 0;
        for(int nnum:set2){
            res[value]=nnum;
            value++;
        }
        return res;
    }
}