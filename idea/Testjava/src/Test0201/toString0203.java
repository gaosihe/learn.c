package Test0201;

public class toString0203 {
    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }

    public static void test1() {
        System.out.println(new toString0203());
    }

    public static void test2() {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        for (int i=0;i<arr1.length;i++){//交换数组
            int temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr2[i]);
        }
    }

    public static void test3() {
        int[] arr3={1,2,3,4,5,6,7,8};
        int count1=0,count2=0,j=0;
        int[] arr4=new int[arr3.length];//创建两个新数组存偶数和奇数
        int[] arr5=new int[arr3.length];
        for (int i=0;i<arr3.length;i++){
            if (arr3[i]%2==0){
                arr4[count1++]=arr3[i];//存偶数
                j++;
            }else{
                arr5[count2++]=arr3[i];//存奇数
            }
        }
        for (int i=0;i<arr3.length;i++){//将两个数组合并到原来数组中
            if (i<j){
                arr3[i]=arr4[i];
            }else{
                arr3[i]=arr5[i-j];
            }
        }
        for (int i=0;i<arr3.length;i++){//打印数组
            System.out.println(arr3[i]);
        }
    }
    public static void main(String[] args) {
        test3();
    }
}
