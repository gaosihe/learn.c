package Test0407;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Testset0414 {
    public static void main(String[] args) {
        //1.实例化set
        Set<String> set = new HashSet<>();
        //2.往set中插入元素
        set.add("hello");
        set.add("aaa");
        set.add("bbb");
        //3.判断某个值是否存在\
        System.out.println(set.contains("aaa"));
        //删除
        set.remove("aaa");
        System.out.println(set.contains("aaa"));
        //5.遍历打印
        //System.out.println(set);
        //循环遍历需要使用迭代器
        //迭代器钟得泛型参数和集合类钟得元素参数保持一致
        //集合类内部自己实现自己版本的迭代器类,不同的集合类,内部的迭代器类型不同
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next  = iterator.next();
            System.out.print(next);
        }

    }
}
