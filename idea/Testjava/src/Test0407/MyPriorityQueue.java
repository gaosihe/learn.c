package Test0407;

public class MyPriorityQueue {//优先队列
    //array 其实应该是堆
    private int[] array = new int[100];
    private int size = 0;

    public void offer(int x){//入队列
        array[size] = x;
        size++;
        //把新加入的元素向上调整
        shiftUp(array,size-1);
    }

    private static void shiftUp(int [] array,int index){
        int child = index;
        int parent = (child-1)/2;
        while (child > 0 ){
            if (array[parent]< array[child]){
                int tmp = array[parent];
                array[parent] = array [ child];
                array[child] = tmp ;
            }else {
                //符合堆结构
                break;
            }
            child = parent;
            parent = (child -1 )/2;
        }
    }
    public int poll(){//出队列
        //下标为0的元素就是队首元素,删掉的同时保证剩下的元素任然是一个堆
        //要想删除堆顶元素,直接把数组的最后元素赋值到第一个元素
        //然后size--删掉最后一个元素
        //再将根节点向下调整就好了
        int oidValue = array[0];
        array[0] = array[size-1];
        size--;
        shiftDown(array,size,0);
        return oidValue;
    }
    private static void shiftDown(int [] array,int size,int index){
        int parent = index;
        int child = 2*parent+1;
        //这个条件的含义是看看parent有没有子节点
        while (child < size){
            //把左右子树中较大的找到
            if (child +1 < size && array[child+1]>array[child]) {
                child = child + 1;
            }
            //上述条件结束后,child肯定对应左右子树中比较大的元素
            //再拿当前的child和parent位置的元素比较
            if (array [ child]>array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent]=tmp;
            }else{
                //符合
                break;
            }
            parent = child;
            child = 2*parent+1;
        }
    }

    public int peek(){//取堆顶元素
        return array[0];
    }

    public boolean isEmpty(){
        return size== 0;
    }
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);

        while (!queue.isEmpty()){
            int cur = queue.poll();
            System.out.println(cur);
        }
    }
}












