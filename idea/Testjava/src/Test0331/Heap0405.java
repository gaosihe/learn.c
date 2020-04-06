package Test0331;

public class Heap0405 {
    //通过size指定array中哪些元素是有效的堆元素
    public static void shiftDown(int[] array,int size,int index){//向下调整 构建堆
        int parent = index;
        int child = 2*parent+1;
        while (child< size){
            if (child+1<size && array[child+1]<array[child]){
                child = child+1;
            }
            //经过上面比较,已经不知道child是左子树还是右子树,
            //指定的是child下标一定是对应左右子树最小值的下标

            //拿child位置的元素和parent 位置的元素进行比较
            if (array[child]<array[parent]){
                //不符合小堆规则,交换父子节点
                int tmp = array[child];
                array[child]=array[parent];
                array[parent]=tmp;
            }
            else{
                //调整完了
                break;
            }
            parent = child;
            child = parent*2+1;
            //更新parent和child 处理下一层
        }
    }

    public static void createHeap(int[] array,int size){
        for (int i= (size-1-1)/2;i>= 0; i--){
            shiftDown(array,size,i);
        }
    }
}
