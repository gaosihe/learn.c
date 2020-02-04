package Test0204;

import java.lang.reflect.Array;

public class ToLowerCase0204 {
    public static void main(String[] args) {
        //System.out.println(ToLowerCase("HELLO"));
        int [] array={1,2,3,4,5,6,7};
        solution(array,3);
        for (int i=0;i<array.length;i++)
        System.out.println(array[i]);
    }

    public static String ToLowerCase(String str) {//将字符串的大写字母变成小写
        if(str==null){
            return null;
        }
        char[] array=new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<=90&&str.charAt(i)>=65){
               char newChar=(char)(str.charAt(i)+32);
               array[i]=newChar;
            }
            else{
                array[i]=(char)str.charAt(i);
            }
        }
        return new String(array);
    }
    public static int[] solution(int []array,int x) {//给定一个数组，
        // 将数组中的元素向右移动 k 个位置，其中 k 是非负数
        int[] temp=new int[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        int t=0;
        for(int i=0;i<array.length;i++){
           t=(i+x)%array.length;
           array[t]=temp[i];
        }
        return array;
    }
}
