package Test0105;
class Node{
    public int data;//数据
    public Node next;//下一个节点位置

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList {
    //管理所有链表节点,只需记录头结点的位置
    private Node head = null;
    public void addFirst(int data){
        //根据data值构建一个链表节点(node对象)
        Node node=new Node(data);
        //如果是空链表
        if(head==null){
            head=node;
            return;
        }
        //3.如果链表不是空链表
        node.next = head;
        head=node;
    }
    public void addLast(int data){
        //1.根据data构造一个Node对象
        Node node=new Node(data);
        //如果空链表
        if(head==null){
            head=node;
            return;
        }
        //如果不是空链表,先找到链表末尾的最后一个
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        //循环结束之后,tail就对应最后一个节点了
        tail.next=node;
    }
    public void dispaly() {
        //打印链表的每个元素
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data + " ");
        }
        System.out.println();
    }
    public int getSize(){
        int size=0;
        for (Node cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
    //插入成功返回true,否则false
    public boolean addIndex(int index,int data){
        //判定index是否有效
        if(index<0||index>getSize()){
            //index无效,插入失败
            return false;
        }
        //2.如果index为0,相当于头插
        if(index==0){
            addFirst(data);
            return true;
        }
        //3.如果index=size,相当于尾插
        if(index==getSize()){
            addLast(data);
            return true;
        }
        Node node=new Node(data);
        //4.如果index是一个中间位置
        //先找到index的前一个节点index-1
        Node prev=getPos(index-1);
        //接下来就把新节点插入到prev之后
        //注释是头插的代码
        //node.next=head;
        //head=node;
        node.next=prev.next;
        prev.next=node;
        return true;
    }
    //给定index下标,找到对应的节点
    private Node getPos(int index){
        Node cur=head;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    public boolean contains(int toFind) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == toFind) {
                return true;
            }
        }
        return false;
    }
    public void remove(int toRemove) {
        // 1. 如果要删除元素是头结点, 特殊处理一下
        if (head.data == toRemove) {
            // 头结点要被删掉
            head = head.next;
            return;
        }
        // 2. 如果要删除元素不是头结点, 找到要删除节点的前一个位置
        Node prev = searchPrev(toRemove);
        // 3. 修改引用的指向, 完成删除
        // prev.next = prev.next.next;
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    private Node searchPrev(int toRemove) {
        // 找到 toRemove 的前一个节点
        for (Node cur = head; cur != null
                && cur.next != null; cur = cur.next) {
            if (cur.next.data == toRemove) {
                return cur;
            }
        }
        return null;
    }

    public void removeAll(int toRemove) {
        // 1. 先删除非头结点, 需要找到待删除节点的前一个位置
        //    prev 始终指向 cur 的前一个位置
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data == toRemove) {
                // cur 节点需要被删除掉
                prev.next = cur.next;
                cur = prev.next;
            } else {
                // prev 和 cur 同步往后移动
                prev = cur;
                cur = cur.next;
            }
        }
        // 2. 处理头结点为要删除节点的情况
        if (head.data == toRemove) {
            head = head.next;
        }
    }

    public void clear() {
        head = null;
    }
}