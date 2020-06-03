package Test0407;

import java.util.Arrays;
import java.util.Stack;

public class TestSort0412 {
    public static void quickSort(int[] array) {//快速排序
        //辅助完成递归
        //此处为了代码简单,区间设成前闭后闭
        quickSortHelper(array, 0, array.length - 1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left >= right) {
            //一个或0个元素,不用排序
            return;
        }
        //针对[left,right]调整
        //index获取left和right重合的位置
        int index = partition(array, left, right);
        quickSortHelper(array, left, index - 1);
        quickSortHelper(array, index +1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        //取右侧为基准值
        int base = array[right];
        while (i < j) {
            //从左往右找比基准值大的
            while (i < j && array[i] <= base) {
                i++;
            }
            //当上面循环结束,i和j要么重合,要么i就指向一个大于base的值
            //从右往左找比基准值小的
            while (i < j && array[j] >= base) {
                j--;
            }
            //当上面循环结束,i和j要么重合,要么j就指向一个小于base的值
            swaps(array, i, j);
        }
        //最后把重合元素和基准值进行交换
        swaps(array,i,right);
        return i;
    }
    private static void swaps(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] =array [j];
        array[j] = tmp;
    }

    public static void quickSortByLoop(int[] array){//快速排序非递归
        //借助栈存放下标
        Stack<Integer> stack =new Stack<>();
        //初始情况下,先把右侧边界下标入栈,再把左侧下标入栈,前闭后闭
        stack.push(array.length-1);
        stack.push(0);
        while (!stack.isEmpty()){
            int left =stack.pop();
            int right =stack.pop();
            if (left>= right){
                //只有一个或者0个元素
                continue;
            }
            //通过partition把区间整理成基准值为中心
            int index=partition(array,left,right);
            //准备处理下个区间
            //右侧区间
            stack.push(right);
            stack.push(index+1);
            //左侧区间
            stack.push(index-1);
            stack.push(left);
        }
    }



    public static void merge(int [] array,int low,int mid,int high){
        //两个有序区间合并
        //[low,mid)有序区间
        //[mid,higt)有序区间
        int[] output = new int[high-low];
        int outputIndex = 0;
        int  cur1 = low;
        int  cur2 = mid;

        while (cur1<mid&&cur2<high){
            if (array[cur1]<=array[cur2]){
                output[outputIndex] = array[cur1];
                outputIndex++;
                cur1++;
            }
            else{
                output[outputIndex] = array[cur2];
                outputIndex++;
                cur2++;
            }
        }
        //上面循环结束的时候,只有一个cur到达末尾,把剩下的拷贝到output中
        while (cur1<mid){
            output[outputIndex] = array[cur1];
            outputIndex++;
            cur1++;
        }
        while (cur2<high){
            output[outputIndex] = array[cur2];
            outputIndex++;
            cur2++;
        }
        //把output中的元素再搬运回原来的数组
        for (int i =0;i<high -low;i++){
            array[low +i]= output[i];
        }
    }

    public static void mergeSort(int [] array){//归并排序
        mergeSortHelper(array,0,array.length);
    }

    private static void mergeSortHelper(int[] array, int low, int high) {
        if (high-low <= 1){//前闭后开
            return;
        }
        int mid = (low+high)/2;
        mergeSortHelper(array,low,mid);
        mergeSortHelper(array,mid,high);
        //当左右区间归并完了,则已经为有序区间
        merge(array,low,mid,high);
        //数组进行合并
    }

    public static void mergeSortByLoop(int[] array){
        //引入一个gap变量进行分组
        //当gap为1的时候,[0],[1]进行合并,[2],[3]-进行合并[4],[5]进行合并[6][7]进行...
        //当gap为2的时候,[0,1][2,3]-进行合并[4,5][6,7]进行合并
        //当gap为4的时候,[0,1,2,3]和[4,5,6,7]进行合并
        for (int gap = 1;gap<array.length;gap*=2){
            for (int i =0;i<array.length;i+=2*gap){
                //当前相邻组
                //[beg,mid)
                //[mid,end)
                int beg = i;
                int mid = i+gap;
                int end = i+2*gap;
                if (mid>array.length){
                    mid = array.length;
                }
                //防止下标越界
                if (end>array.length){
                    end = array.length;
                }
                merge(array,beg,mid,end);
            }
        }
    }

    public static void main(String[] args) {
        int [] array ={2,7,4,8,9,3,6,1,5};
        quickSort(array);
        //mergeSort(array);
        //mergeSortByLoop(array);
        System.out.println(Arrays.toString(array));
    }
}












