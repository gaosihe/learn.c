package Test0407;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SetMapInterview0414 {
//    public int singleNumber(int[] nums){//只出现一次的数字
//        //1.创建一个Map统计每个数字出现的次数,kay表示数字,value表示这个数字出现的次数
//        Map<Integer,Integer>map = new HashMap<>();
//        //2遍历数组
//        for(int x :nums){
//            Integer value = map.get(x);
//            if (value==null){
//                //数字不存在
//                map.put(x,1);
//            }
//            else {
//                //数字存在过了 把value加一
//                map.put(x,value+1);
//            }
//        }
//        System.out.println("统计出现次数结果");
//        System.out.println(map);
//        //3,遍历map找到次数为1的数字
////        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
////            //getValue得到的是Integer的包装类,通过equals判定相当于对1进行自动装箱,比较两个Integer
////            //如果写成==1,相当于对Integer自动拆箱,比较两个==
////            if(entry.getValue().equals(1)){
////                return entry.getKey();
////            }
////        }
//        //使用迭代器
//        Iterator<HashMap.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            HashMap.Entry<Integer,Integer>entry = iterator.next();
//            if (entry.getValue().equals(1)){
//                return entry.getKey();
//            }
//        }
//        return 0;
//    }

    public int singleNumber(int[] array){
        int ret = 0 ;
        for (int x:array){
            ret ^=x;
        }
        return ret;
    }

    public int[] singleNumber2(int[] nums){//两个出现次数为1的树
        //所有数字异或到一起
        int ret = 0;
        for (int x:nums){
            ret ^=x;
        }
        //此时的异或结果相当于a^b,值不一定为0,就可以从中找到某个为1的bit 位
        int bit = 1;
        int i = 0;
        for (;i<32;i++){
            if ((ret&(bit<<i))!= 0){
                break;
            }
        }
        //循环结束之后,bit的值就是,刚找到某一位为1的值
        //进行分组
        int a = 0;
        int b = 0;
        for (int x: nums){
            if ((x&(bit<<i))!=0){
                //第一组指定位为1
                a^=x;
            }else {
                //第二组指定位为0
                b^=x;
            }
        }
        int[] array = {a,b};
        return array;
    }
    public static void main(String[] args) {
        SetMapInterview0414 interview0414 = new SetMapInterview0414();
        int[] arr = {1,1,2,2,4,5};
        int[] array = interview0414.singleNumber2(arr);
        System.out.println(Arrays.toString(array));
    }
}
