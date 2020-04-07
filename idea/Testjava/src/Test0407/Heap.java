package Test0407;

import java.lang.reflect.Array;
import java.util.Arrays;

//按大堆实现
public class Heap {
    //size:array中哪部分是堆
    //从index向下调整
    public static void shiftDown(int [] array,int size,int index){
        int parent = index;
        int child = 2*parent+1;
        //这个条件的含义是看看parent有没有子节点
        while (child < size){
            //把左右子树中较大的找到
            if (child +1 < size && array[child+1]>array[child]) {
                child = child + 1;
            }
            //上述条件结束后,child肯定对应左右子树中比较大的元素
            //再拿当前的child和parent位置的元素比较
            if (array [ child]>array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent]=tmp;
            }else{
                //符合
                break;
            }
            parent = child;
            child = 2*parent+1;
        }
    }
    public static void createHeap(int[] array,int size){
       //基于向下调整从后往前遍历建堆
       for (int i = (size -1-1)/2;i>=0;i--){
           shiftDown(array,size,i);
       }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}












