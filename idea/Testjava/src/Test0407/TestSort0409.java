package Test0407;

import java.util.Arrays;

public class TestSort0409 {
    public static void insertSort(int[] array){//插入排序
        //通过bound 来划分出两个区间
        //[0,bound)已排序区间
        //[bound,size)待排序区间
        for(int bound=1 ;bound<array.length;bound++){
            int v = array[bound];
            int cur = bound-1;
            //已排序区间的最后下标
            for (;cur>= 0 ; cur--){
                if(array[cur]>v){
                    array[cur+1] = array[cur];
                }
                else{
                    break;
                }
            }
            array[cur+1] = v;
        }
    }

    public static void shellSort(int[] array){//希尔排序
        int gap = array.length/2;
        while(gap>1){
            //需要循环分组插排
            insertSortGap(array,gap);
            gap= gap/2;
        }
        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array, int gap) {
        //通过bound 来划分出两个区间
        //[0,bound)已排序区间
        //[bound,size)待排序区间
        for(int bound=gap ;bound<array.length;bound++){
            int v = array[bound];
            int cur = bound-gap;
            //已排序区间的最后下标
            for (;cur>= 0 ; cur-=gap){
                if(array[cur]>v){
                    array[cur+gap] = array[cur];
                }
                else{
                    break;
                }
            }
            array[cur+gap] = v;
        }
    }


    public static void selectSort(int[] array){
        for (int bound=0;bound < array.length; bound++){
            //从带排序区间依次和bound比较
            for (int cur = bound+1 ; cur<array.length; cur++){
                if (array[bound]>array[cur]){
                    int tmp = array[cur];
                    array[cur] = array[bound];
                    array[bound] =tmp;
                }
            }
        }
    }


    public static void swap(int[] array,int i ,int  j){
        int tmp = array[i];
        array[i]=array[j];
        array[j]= tmp;
    }
    public static void heapSort(int[] array){//堆排序,先建堆
        creatrHeap(array);
        //循环吧堆顶元素交换到最后,进行调整
        //循环length-1次,最后一个元素不用循环
        for (int i =0 ;i<array.length-1; i++){
            //交换堆顶元素和最后一个元素
            //最后一个元素下标为array-1-i
            swap(array,0,array.length-1-i);
            //交换完成后,要把最后一个元素从堆中删掉,堆的长度进一步缩水
            //数组中[0,array.length-1-i)待排序区间
            //特别注意边界条件,最好代入数值验证
            shiftDown(array,array.length-1-i,0);
        }
    }

    private static void shiftDown(int[] array, int heapLength, int index) {
        //这里升序排序,建的是大堆,
        int parent = index;
        int child = 2*parent+1;
        while (child<heapLength){
            if (child+1<heapLength&&array[child+1]>array[child]){
                child = child+1;
            }
            if (array[child]>array[parent]){
                swap(array,child,parent);
            }else{
                break;
            }
            parent =child;
            child = 2*parent+1;
        }
    }

    public static void bubbleSort(int[] array){//冒泡排序
        //按照每次找最小的方式来进行排序,从后往前比较交换
        for(int bound = 0;bound<array.length;bound++){
            for (int cur = array.length-1;cur>bound;cur--){
                if (array[cur-1]>array[cur]){
                    swap(array,cur-1,cur);
                }
            }
        }

    }

    private static void creatrHeap(int[] array) {
        //从最后一个非叶子节点出发向前循环,依次向下调整
        for (int i= (array.length-1-1)/2;i >= 0;i--){
            shiftDown(array,array.length,i);
        }
    }

    public static void main(String[] args) {
        int[ ] arr = {9,5,2,7,3,6,8};
        shellSort(arr);
        //selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
