package Test2;
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Tests0623 {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null||pHead.next ==null) {
            return null;
        }
        // write code here
        ListNode node = pHead;
        ListNode node3 = new ListNode(node.val);
        ListNode node4 = new ListNode(node.val);
        ListNode node1 = node3;
        ListNode node2 = node4;
        while (node!= null){
            if (node.val<x){
                node1.next = new ListNode(node.val);
                node1 = node1.next;
            }else {
                node2.next = new ListNode(node.val);
                node2 = node2.next;
            }
            node = node.next;
        }
        node=node3;
        while(node.next!=null&&node.next.val!=-1){
            node=node.next;
        }
        node.next = node4.next;
        return node3.next;
    }
}