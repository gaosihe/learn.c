package Test3;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class PlusAB {
    public static void main(String[] args) {
        ListNode A = new ListNode(3);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(2);
        ListNode D = new ListNode(1);
        ListNode pHead1 = new ListNode(1);
        ListNode pHead2 = new ListNode(3);
        pHead1.next  = B;
        B.next = A;
        pHead2.next = C;
        C.next = D;
        Plus(pHead1,pHead2);
    }

    private static ListNode Plus(ListNode a, ListNode b) {
        ListNode pHead = null;
        ListNode tail = pHead;
        boolean jinwei = false;
        while (a!=null&&b!=null){
            int temp = a.val+b.val;

            if (pHead ==null){
                if (jinwei){
                    pHead = new ListNode(1);
                    tail = pHead;
                }else {
                    pHead = new  ListNode(0);
                    tail = pHead;
                }
            }else {
                if (jinwei){
                    tail.next = new ListNode(0);
                    temp+=1;
                    tail= tail.next;
                }else {
                    tail.next=new ListNode(0);
                    tail=tail.next;
                }
            }
            if (temp>=10){
                temp-=10;
                jinwei = true;
            }else {
                jinwei = false;
            }
            tail.val+=temp;
            a = a.next;
            b = b.next;
        }
        while (a!=null){
            int temp = a.val;
            if (jinwei){
                tail.next = new ListNode(0);
                temp+=1;
                tail = tail.next;
            }else {
                tail.next = new ListNode(0);
                tail = tail.next;
            }
            if (temp>=10){
                temp-=10;
                jinwei = true;
            }else {
                jinwei = false;
            }
            tail.val+=temp;
            a = a.next;
        }
        while (b!=null){
            int temp = b.val;
            if (jinwei){
                tail.next = new ListNode(0);
                temp+=1;
                tail = tail.next;
            }else {
                tail.next = new ListNode(0);
                tail = tail.next;
            }
            if (temp>=10){
                temp-=10;
                jinwei = true;
            }else {
                jinwei = false;
            }
            tail.val+=temp;
            b = b.next;
        }
        if (a==null&&b==null){
            if (jinwei){
                tail.next = new ListNode(1);
                tail = tail.next;
            }
        }
        return pHead;
    }

}
