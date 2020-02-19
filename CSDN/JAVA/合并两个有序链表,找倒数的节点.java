/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
        if(l1==null){//是否有空链表
            return l2;
        }if(l2==null){
            return l1;
        }
        ListNode prehead = new ListNode(-1);
        
        ListNode Node = prehead;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){//判断大小,按顺序排给新创建的链表
                Node.next=l1;
                l1=l1.next;
            }else{
                Node.next=l2;
                l2=l2.next;
            }
                Node=Node.next;
        }
        Node.next = l1 == null ? l2 : l1;//判断哪个链表为null了,将另一个剩余部分接上
        return prehead.next;
    }
}


/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {//链表中倒数第k个结点
         int size=0;
        if(head!=null){
            size++;
        }else{
            return null;
        }
        // 计算总的节点数量
        ListNode cur=head.next;
        while(cur!= null){
            size++;
            cur=cur.next;
        }
        if(size<k){
            return null;
        }// 倒数第k个为正数第totalNum-k+1个
        ListNode resultNode = head;
        for(int i=1;i<=size-k;i++){
            resultNode = resultNode.next;
        }
        return resultNode;
    }
}