class Solution {
    public boolean canThreePartsEqualSum(int[] A) {//将数组分成相等的三个部分
        int sum = 0;
        for(int i: A){
            sum += i;
        }
        if(sum%3!=0){
            return true;
        }
        int left=0;
        int leftsum=A[left];
        int right=A.length-1;
        int rightsum=A[right];
        while(left+1<right){
            if(leftsum==sum/3&&rightsum==sum/3){
                return true;
            }
            if(leftsum!=sum/3){
                leftsum+=A[++left];
            }
            if(rightsum!=sum/3){
                rightsum +=A[--right];
            }
        }
        return false;
    }
}