package main.Test01;

import java.util.ArrayList;
 class ListNode {
        int val;
       ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
   }

/*
import java.util.ArrayList;
import java.util.Stack;
public class ArrayList0815 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
*/
public class ArrayList0815 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Printhelper(list,listNode);
        return list;
    }
    public void Printhelper(ArrayList<Integer> list,ListNode listNode){
        if(listNode==null){
            return ;
        }
        Printhelper(list,listNode.next);
        list.add(listNode.val);

    }
}
