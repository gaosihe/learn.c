package Test0204;

public class sortedSquares0210 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("gsh_gsh_a"));
        int [] a={-3,-1,2,4,};
        for (int i=0;i<a.length;i++)
        System.out.print(sortedSquares(a)[i]+" ");
    }
        public static int[] sortedSquares(int[] A) {//有序数组的平方排序
            int []arr1=new int[A.length];
            for(int i=0;i<A.length;i++){
                arr1[i]=A[i]*A[i];
            }
            for(int j=1;j<arr1.length;j++){
                for(int k=0;k<j;k++){
                    if(arr1[j]<arr1[k]){
                        int temp=arr1[j];
                        arr1[j]=arr1[k];
                        arr1[k]=temp;
                    }
                }
            }
            return arr1;
        }
        public static String reverseOnlyLetters(String S) {//反转字母
            char[] chars = S.toCharArray();
            int right = 0, left = chars.length - 1;

            while (right < left) {
                if (checkChar(chars[right])) {
                    while (right < left) {
                        if (checkChar(chars[left])) {
                            char c = chars[left];
                            chars[left] = chars[right];
                            chars[right] = c;
                            left--;
                            break;
                        }
                        left--;
                    }
                }
                right++;
            }

            return new String(chars);
        }

        private static boolean checkChar(char c) {
            return (c >= 65 && c <= 90) || c >= 97;
        }
    }
