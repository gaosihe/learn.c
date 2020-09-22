package Test.Test6;

public class Test0922 {
    public static void main(String[] args) {
        int r[] ={1,2,3,4};
        System.out.println(pushIntArray(r,1));
    }
        /**
         * 数组内数据循环平移
         * @param arr int整型一维数组 输入数组
         * @param pushOffset int整型 位移长度
         * @return int整型一维数组
         */
        public static int[] pushIntArray (int[] arr, int pushOffset) {
            // write code here
            if(arr.length<=1) return arr;
            for(int i = 0; i<pushOffset;i++){
                int temp = arr[0];
                for(int j = 1;j<arr.length;j++){
                    arr[j-1] = arr[j];
                }
                arr[arr.length-1]=temp;
            }
            return arr;
        }
}
