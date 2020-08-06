import java.util.*;

public class AscentSequence {
    public int findLongest(int[] A, int n) {
        // write code here
        int length = A.length;
        int[] B =new int[length];
        int ten = 0;
        B[0]= A[0];
        for(int i = 1;i<length;i++){
            if(A[i]> B[ten]){
                B[++ten] = A[i];
                continue;
            }else{
                B[helper(B,A[i],0,ten)] = A[i];
            }
        }
        return ten+1;
        
    }
    public static int helper(int[] B ,int A, int left, int right){
        while(left<right){
            int mid = left+(right-left)/2;
            if(B[mid]>A){
                right = mid;
            }else if(B[mid]<A){
                left = mid+1;
            }else{
                return mid ;
            }
        }
        return left;
    }
}