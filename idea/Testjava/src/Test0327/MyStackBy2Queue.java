package Test0327;

import java.util.LinkedList;
import java.util.Queue;

public class MyStackBy2Queue {//用两个队列实现栈
    private Queue<Integer> A =new LinkedList<>();
    private Queue<Integer> B =new LinkedList<>();

    public void push(int x){
        //x往A中入队列
        A.offer(x);
    }
    public Integer pop(){
        if (empty()){
            return null;
        }
        //把A中的元素往B中加入
        while (A.size() >1){
            Integer front = A.poll();
            B.offer(front);
        }
        //循环结束只剩下一个元素
        //即为出栈的元素
        int ret = A.poll();
        //交换A和B的身份
        swapAB();
        return ret;
    }

    private void swapAB(){
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }
    public Integer top(){
        if (empty()){
            return null;
        }
        //把A中的元素往B中加入
        while (A.size() >1){
            Integer front = A.poll();
            B.offer(front);
        }
        //循环结束只剩下一个元素
        //即为出栈的元素
        int ret = A.poll();
        B.offer(ret);//top和pop唯一的区别就是这里
        //交换A和B的身份
        swapAB();
        return ret;
    }

    public boolean empty(){
        return A.isEmpty()&&B.isEmpty();
    }
}
