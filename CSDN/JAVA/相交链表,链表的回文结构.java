import java.util.*;

/*
public class ListNode {//链表的回文结构
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        // write code here
    ListNode B = reverseList(A);
        while(A != null){//比较反转后的链表与之前是否相同
            if(A.val != B.val){
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }
     
   public ListNode reverseList(ListNode head){
       if(head == null){
           return null;
       }
       //直接处理第一个节点
       ListNode newHead = new ListNode(head.val);       
       newHead.next = null;//第一个数字指向null
       ListNode temp = null ;
       //直接从第二个节点开始处理（从第二个节点开始的处理方式一样）
       while(head.next != null){
           temp = new ListNode(head.next.val);
           //后面的数指向前面的数实现反转
           temp.next = newHead;
           newHead = temp;
           head = head.next;
       }
       return newHead;      
   }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {//编写一个程序，找到两个单链表相交的起始节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /**
        定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
        两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
        **/
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}