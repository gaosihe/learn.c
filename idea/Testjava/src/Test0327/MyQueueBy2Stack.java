package Test0327;

import java.util.Stack;

public class MyQueueBy2Stack {
    private Stack<Integer> A =new Stack<>();
    private Stack<Integer> B =new Stack<>();

    public void push(int x){
        //先把B钟得元素加入A中
        while(!B.isEmpty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }

    public Integer pop(){
        //1.如果为空,就直接返回
        if (empty()){
            return null;
        }
        //2.把A的元素倒腾给B
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        //3.针对B进行出栈
        return B.pop();
    }

    public  Integer peek(){
        if (empty()){
            return null;
        }
        //2.把A的元素倒腾给B
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        //3.直接取B的栈顶元素
        return B.peek();
    }

    public boolean empty(){
       return A.isEmpty()&&B.isEmpty();
    }
}
