package Test0416;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomp implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        //sort方法默认升序排序
        //compare方法相当于重新定义什么是小
        //如果返回<0的数,认为o1比o2小
        //如果返回>0的数,认为o2比o1小
        //如果返回0,认为o1和o2一样小
        //如果想要降序排,就让大的数定义为"小"
        return o2-o1;
    }
}

//和@Override类似,都是为了进行更严格的语法检查
@FunctionalInterface
interface TwoParamReturnInt{
    Integer func(Integer a,Integer b);
}

public class TestLambda {
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList= new ArrayList<>();
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(7);
        //sort是升序排序,要sort能降序排序,就需要给sort的第二个参数指定一个比较器对象
        //Collections.sort(arrayList,new Mycomp());
        //(o2-o1)->o2-o1
        //1.lambda中参数类型可以省略
//        Collections.sort(arrayList, (Integer o1,Integer o2) -> {
//            return o2-o1;
//        });
//        TwoParamReturnInt myInterface = (Integer o1,Integer o2)->{
//            return o2-o1;
//        };
//
//        Integer ret =myInterface.func(10,20);
//        System.out.println(ret);
        String str = "test";
        Collections.sort(arrayList, (Integer o1,Integer o2) -> {
            //变量捕获
            System.out.println(str);
           return o2-o1;
        });
        System.out.println(arrayList);
    }
}
