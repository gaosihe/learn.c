package main.Test01;

import javax.xml.soap.Node;

public class Test0820 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(2);
        ListNode B = new ListNode(3);
        ListNode C = new ListNode(4);
        ListNode D = new ListNode(5);
        head.next = A;
        A.next =B;
        B.next = C;
        C.next =D;
        D.next = null;
        reorderList(head);
    }
    public static void reorderList(ListNode head) {
        ListNode curr = null;
        ListNode node = null;
        ListNode Nhead = head;
        ListNode Chead = null;
        ListNode m =null;
        while (head!=null){
            if (Chead == null){
                curr = new ListNode(head.val);
                Chead = curr;
                m = Chead;
            }else {
                ListNode n = new ListNode(head.val);
                m.next = n;
                m = m.next;
            }
            head = head.next;
        }
        int count = 1;
        while(Nhead.next!=null){
            curr= Nhead.next;
            Nhead.next = node;
            node = Nhead;
            Nhead = curr;
            count++;
        }
        Nhead.next = node;
        int num = 0;
        boolean tag = true;
        ListNode node1 = new ListNode(1);
        ListNode k = node1;
        for (int i = 0;i<count-1;i++){
            ListNode e = new ListNode(1);
            k.next = e;
            k=k.next;
        }
        k.next = null;
        ListNode k1 = node1;
        while(num<count){
            if(tag){
                k1.val =Chead.val;
                k1 = k1.next;
                Chead = Chead.next;
                tag = false;
            }else{
                k1.val=Nhead.val;
                k1 = k1.next;
                Nhead = Nhead.next;
                tag = true;
            }
            num++;
        }
        while (node1!=null) {
            System.out.println(node1.val);
            node1 =node1.next;
        }
    }
}