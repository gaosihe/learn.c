import java.util.*;

public class Joseph {
    public int getResult(int n) {
         // write code here
        if(n<1) return -1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int count = 2,i,curr=0;
        for(i=1;i<=n;i++){
            list.add(i);
        }
        while(list.size()>1){
            i=0;
            while(list.size()>1&&list.size()>i){
                curr = (curr+1)%count;
                if(curr != 1){
                    list.remove(i);
                }else{
                    i++;
                }
            }
            count++;//报的数字加一
            curr=0;//重新一轮
            if(list.size() > 1){//将最后一个节点放在首位
                 int last = list.removeLast();
                list.addFirst(last);
            }
        }
        return list.pop();
    }
}