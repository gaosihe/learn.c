package Test0201;
import java.util.*;
public class Testtest0201 {
    public static void main(String[] args) {
        //Max2();
        //sort();
        //njiechen();
        //FibonacciD(9);
        //FindNumsAppearOnce();
        chongzai();
    }
    public static void Max2() {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int max2=0;
        if(i>j){
            max2=i;
        }
        else{
            max2=j;
        }
        Max3(max2);
    }

    public static void Max3(int max2) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int max3=0;
        if(k>max2){
            max3=k;
        }
        else{
            max3=max2;
        }
        System.out.println("三个数最大值为"+max3);
    }

    public static void sort() {//将数组的奇数放在前面
        int[] temp = {1, 2, 3, 4, 5, 6, 7};
        int[] array1 = new int[temp.length];
        int[] array2 = new int[temp.length];
        int length1 = 0, length2 = 0;
        int j = 0, k = 0;
        for (int i = 0; i < temp.length; i++) {//将奇数放入一个数组
            if (temp[i] % 2 == 1) {
                array1[j++] = temp[i];
                length1++;
            }
        }
        for (int i = 0; i < temp.length; i++) {//将偶数放入一个数组
            if (temp[i] % 2 == 0) {
                array2[k++] = temp[i];
                length2++;
            }
        }
        for (int i = 0; i < length1; i++) {
            temp[i] = array1[i];
        }
        for (int i = 0; i < length2; i++) {
            temp[i + length1] = array2[i];
        }
        for (int i = 0; i < temp.length; i++) {//打印数组
            System.out.print(temp[i] + " ");
        }
    }
    public static void njiechen() {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int j=0;
        int num=1;
        for (int i=1;i<k+1;i++){
            num*=i;
            j+=num;
        }
        System.out.println(num);//n的阶乘
        System.out.println(j);//1!+2!+3!+...+n!
    }
    public static int FibonacciD(int num) {
        if(num <= 0) {
            return 0;
        }
        if(num == 1 || num == 2) {
            return 1;
        }
        int first = 1,second =1,third = 0;
        for(int i = 3; i<= num ;i++) {
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println(third);
        return third;
    }

    public static void FindNumsAppearOnce() {//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
        int [] data={2,3,3,5,4,2,4};
        int num1=0;
            if (data.length < 2)
                return;
            int num2= 0;
            for (int i = 0; i <data.length; ++ i)
                num2^= data[i];
            num1=num2;
        System.out.println(num1);
        }
    public static void chongzai() {
        int a=1;
        int b=2;
        int max1=Max1(a, b);
        System.out.println("max1="+max1);
        double a1=1.1;
        double b1=2.2;
        double max2=Max2(a1,b1);
        System.out.println("max2="+max2);
        int a2=1;
        int a3=2;
        double b2=1.1;
        double max3=Max3(a2,a3,b2);
        System.out.println("max3="+max3);
        double min3=Min3(a2,a3,b2);
        System.out.println("min3="+min3);
    }
    public static double Max3(int a,int b,double c){
        double max3;
        max3=(a>b?a:b)>c?(a>b?a:b):c;
        return max3;
    }
    public static double Min3(int a,int b,double c){
        double min3;
        min3=(a<b?a:b)<c?(a<b?a:b):c;
        return min3;
    }
    public static double Max2(double x,double y){
        double max1;
        if(x>y){
            max1=x;
        }else {
            max1=y;
        }return max1;
    }
    public static int Max1(int x,int y){
        int max1;
        if(x>y){
            max1=x;
        }else {
            max1=y;
        }return max1;
    }
}
