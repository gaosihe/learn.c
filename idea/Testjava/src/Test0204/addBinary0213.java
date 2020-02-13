package Test0204;

public class addBinary0213 {
    public static void main(String[] args) {
        int a[]={2,4,6,9};
        for(int i=0;i<2;i++)
        System.out.println(twoSum(a,6)[i]);
        System.out.println(addBinary("1001","1100"));
    }
    public static String addBinary(String a, String b) {//二进制求和
        int len1=a.length();
        int len2=b.length();
        if(len1<len2) return addBinary(b,a);//将字符串长的设为a
        int []result =new int[len1+1];
        int index=len1-1;
        int j=len2-1;
        while(index>=0){
            int temp=j>=0?(a.charAt(index)-'0')+(b.charAt(j)-'0')+result[index+1]:(a.charAt(index)-'0')+result[index+1];//判断是否b的长度用完,来确定相加的值
            result[index+1]=temp%2;//遍历出相加的值存入result
            result[index]=temp/2;
            index--;
            j--;
        }
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<result.length;i++){
            if(i==0&&result[i]==0)continue;//如果第一位是0则不用输出
            sb.append(result[i]);
        }
        return sb.toString();
    }
    public static int[] twoSum(int[] nums, int target) {//两数之和
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
