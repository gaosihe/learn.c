package Test0416;

//通过开散列的方式来处理hash冲突
public class MyHashMap0420 {
    static class Node{
        public int key;
        public int value;
        public Node next;

        public Node(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final double LOAD_FACTOR = 0.75;

    //array就是hash表的本体,数组的每一个元素又是一个链表的头结点.
    private Node[] array = new Node[101];
    private int size = 0;//表示hash表中得元素个数

    private int hashFunc(int key){
        return key%array.length;
    }

    //如果key已经存在,就修改当前的value值
    //如果key不存在,就插入新的键值对
    public void put(int key, int value){
        //1.需要把key映射成数组下标
        int index = hashFunc(key);
        //2.根据下标找到对应的链表
        Node list =array[index];
        //3.当前key是否再链表中存在
        for (Node cur = list;cur != null;cur = cur.next){
            if (cur.key==key){
                //key已经存在直接修改value
                cur.value = value;
                return;
            }
        }
        //4.如果循环结束,没有找到相同的key的节点,
        // 直接插入到指定链表的头部
        Node newNode = new Node(key,value);
        newNode.next = list;
        array[index] = newNode;
        size++;

        if (size/array.length>LOAD_FACTOR){
            resize();
        }
    }

    private void resize() {//扩容
        Node [] newArray =new Node[array.length*2];
        //原来的元素搬到新的数组上
        for (int i=0;i<array.length;i++){
            for (Node cur = array[i];cur!= null;cur = cur.next){
                int index = cur.key%newArray.length;
                Node newNode = new Node(cur.key,cur.value);
                newNode.next = newArray[index];
                newArray[index] = newNode;
            }
        }
        //让新的数组代替原来的
        array = newArray;
     }

    //根据key查找指定元素,找到就返回对应value,否则返回null
    public Integer get(int key){
        //1.先计算key对应的下标
        int index = hashFunc(key);
        //2.根据下标找到对应的链表
        Node list =array[index];
        //3.在链表中查找
        for (Node cur = list;cur!=null;cur= cur.next){
            if (cur.key==key){
                return cur.value;
            }
        }
        return null;
    }


}
