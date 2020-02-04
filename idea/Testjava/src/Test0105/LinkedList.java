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
}