package Test0204;
import java.util.Arrays;
public class isLongPressedName0209 {
    public static void main(String[] args) {
        int []arr={1,2,4,5,1};
        System.out.println(containsDuplicate(arr));
        System.out.println(isLongPressedName("gsh","gssshh"));
    }
    public static boolean isLongPressedName(String name, String typed) {//是否存在重复元素
        char[] c1 = name.toCharArray();
        char[] c2 = typed.toCharArray();
        int p1=0,p2=0;
        while(p1<c1.length&&p2<c2.length){
            if(c1[p1]==c2[p2]){
                p1++;
            }
            p2++;
        }
        return p1==c1.length;
    }
    public static boolean containsDuplicate(int[] nums) {//长按键入
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;++i){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
