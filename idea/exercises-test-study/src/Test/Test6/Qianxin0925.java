package Test.Test6;

import java.util.*;


public class Qianxin0925 {
    /**
     *
     * @param tasks int整型一维数组 待加工的零件
     * @param n int整型 n的值
     * @return int整型
     */
    public static void main(String[] args){
        int []arr = {1,1,1,2,3,3,3};
        leastWorkTime(arr,2);
    }
    public static int leastWorkTime (int[] tasks, int n) {
        // write code here
        Arrays.sort(tasks);
        int count = 0;
        for (int i = 0;i<tasks.length-1;i++){
            if (tasks[i]==tasks[i+1]){
                count++;
            }
        }
        if (count == 0){
            return tasks.length;
        }else{
            return 2*tasks.length-count-n;
        }
    }
}