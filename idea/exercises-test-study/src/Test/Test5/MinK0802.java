package Test.Test5;

import java.util.*;
public class MinK0802{
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input.length<k){
            return null;
        }
        Arrays.sort(input);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<k;i++){
            arr.add(input[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={4,21,22,11,2,1,5};
        System.out.println(GetLeastNumbers_Solution(arr,10));
    }
}