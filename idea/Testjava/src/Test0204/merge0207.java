package Test0204;

public class merge0207 {
    public static void main(String[] args) {
        //System.out.println(lengthOfLastWord("hello world"));
        int []arr1={1,5,8,0,0,0};
        int []arr2={2,2,4};
        merge(arr1,3,arr2,3);
        for (int i=0;i<arr1.length;i++)
        System.out.println(arr1[i]);
    }
    public static int lengthOfLastWord(String s) {//最后一个单词的长度
        if(s == null || s.length() == 0) return 0;
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(num==0) continue;
                break;
            }
            num++;
        }
        return num;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {//合并两个有序数组
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while(len1 >= 0 && len2 >= 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
}
