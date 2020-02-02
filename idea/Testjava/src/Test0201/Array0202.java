package Test0201;
import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import  java.util.Arrays;
import java.util.Scanner;

public class Array0202 {
    public static void main(String[] args) {
       //arrString();
        //array01();
        //tranform();
        //sum();
        //copyOf();
        //array02();
        //array04();
        array05();
    }

  //编写代码: 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
     public static int array01() {
        int [] array=new int[100];
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
            System.out.println(array[i]);//打印数组
        }
         System.out.println(array);//打印数组地址
        return 0;
        }
    // 编写代码: 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        public static void tranform() {
         int [] array=new int[100];
            for (int i=0;i<array.length;i++){
            array[i]=i+1;
        }  for (int i=0;i<array.length;i++){
                array[i]*=2;
                System.out.println(array[i]);
            }
        }
//编写代码: 实现一个方法 sum, 以数组为参数, 求数组所有元素之和与平均值
        public static void sum() {
        int sums=0;
            int [] array=new int[100];
            for (int i=0;i<array.length;i++){
                array[i]=i+1;
            }  for (int i=0;i<array.length;i++){
                sums+=array[i];
            }
            System.out.println(sums/array.length);//平均值
            System.out.println(sums);//和
        }
//    实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
//    返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
        public static void arrString() {
            int [] array=new int[100];
            for (int i=0;i<array.length;i++){
                array[i]=i+1;
            }
            String x=arr2String(array);
            System.out.println(x);
        }
        public static String arr2String(int [] arr) {
        StringBuilder strb=new StringBuilder();
        for (int i=0;i<arr.length;i++)
            strb.append(arr[i]);
        return strb.toString();
        }
//    实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
        public static void copyOf() {
            int [] array=new int[100];
            for (int i=0;i<array.length;i++){
                array[i]=i+1;
            }
            int [] x= Arrays.copyOf(array,array.length);
            for (int i=0;i<x.length;i++){
                System.out.println(x[i]);
            }
        }
//    给定一个有序整型数组, 实现二分查找
        public static void array02() {
            int [] array=new int[100];
            for (int i=0;i<array.length;i++){
                array[i]=i+1;
            }
            int i=array03(array,63);
            System.out.println(i);
        }
        public static int array03(int[] arr,int x) {

            int right=0,mid,left=arr.length-1;
            while(right<left){
                mid=(right+left)/2;
                if(arr[mid]==x) {
                    return mid;
                }
                else if(x>arr[mid]){
                    right=mid+1;
                }
                else if(x<arr[mid]){
                    left=mid-1;
                }
            }
                return -1;
        }
//    给定一个整型数组, 判定数组是否有序
public static void array04() {
    int[] array={1,2,3,2,3,4};
    int x=lookArray(array);
    if (x==1){
        System.out.println("正序");
    }else if (x==-1){
        System.out.println("逆序");
    }else if(x==0){
        System.out.println("无序");
    }
}

    public static int lookArray(int[] array) {
        int count=0;//冒泡的次数
        int pop =array[0];//上一次交换的气泡
        for (int j=0;j<array.length-1;j++){
            if (array[j]>array[j+1]){
                if (pop!=array[j]){
                    return 0;
                }
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                count++;
                pop=array[j+1];
                if (j+2<array.length){
                    if (array[j]<array[j+2]){//最后一组冒泡交换后的数小于最后一个数
                        return 0;
                    }
                }
            }
        }
        if (count==0){
            return 1;
        }else{
            return -1;
        }
    }
    //    给定一个整型数组, 实现冒泡排序(升序排序)
    public static void array05() {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你要输入的数组长度:");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("输入你要输入的数组:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {//冒泡排序
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}