
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {//删除链表中的重复结点
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        // 构建新的头结点
        ListNode head=new ListNode(Integer.MIN_VALUE);
        head.next=pHead;
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                // 退出循环时，cur 指向重复值，也需要删除，而 cur.next 指向第一个不重复的值
                // cur 继续前进
                cur=cur.next;
                 // pre 连接新结点
                pre.next=cur;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        return head.next;
    }
}


import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
        // write code here
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode cur=pHead;
        ListNode Shead=new ListNode(cur.val);//创建两个链表
        ListNode Bhead=new ListNode(cur.val);
        ListNode Stmp=Shead;
        ListNode Btmp=Bhead;
        while(cur!=null){
            if(cur.val<x){//将大于x和小于x的结点分别保存在两个链表中
                Stmp.next=new ListNode(cur.val);
                Stmp=Stmp.next;
            }else{
                Btmp.next=new ListNode(cur.val);
                Btmp=Btmp.next;
            }
            cur=cur.next;
        }
        cur=Shead;//从小数的链表开始
        while(cur.next!=null&&cur.next.val!=-1){
            cur=cur.next;
        }
        cur.next=Bhead.next;//将小数的链表和大数的链表相连接
            return Shead.next;
    }
}