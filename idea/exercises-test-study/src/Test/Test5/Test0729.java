package Test.Test5;

import java.util.ArrayList;
public class Test0729 {
    public static void main(String[] args) {
        System.out.println(FindContinuousSequence( 45));
    }
        public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//不考虑负数情况
//定义两个位置，表示其实和结束，start和end之间就是一段连续递增的序列
//两个起点，相当于动态窗口的两边，根据其窗口内的值的和来确定窗口的位置和大小
//我们采用闭区间方式进行解决
            int low = 1;
            int high = 2;
            while(low < high){
//由于是连续的，差为1的一个序列，那么求和公式是(a0+an)*n/2
//这里的的low和high不光代表位置，也代表对应的值
                int total = (low + high)*(high-low+1)/2;
                if(total == sum){
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int i = low; i <= high; i++){
                        list.add(i);
                    }
                    result.add(list);
                    low++;
                }
                else if(total < sum){
//说明该序列区间中的数据和小于sum，应该扩大区间,以包含更多数据
                    high++;
                }
                else{
//说明该序列区间中的数据和大于sum，应该缩小区间,以包含较少数据
                    low++;
                }
            }
            return result;
        }
}
