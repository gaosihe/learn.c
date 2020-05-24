package Test0514;

/*阻塞式队列
1.基于数组循环实现
2.提供一个队列
取元素消费的时候,如果队列为空,阻塞等待
如果队列满了,存生产元素的时候,阻塞等待
 */
public class MyBlockingQueue0524<T> {

    private  Object[] table;
    //取元素的索引位置
    private int takeIndex;
    //存元素的索引位置
    private int size;
    //大小
    private int putIndex;

    public MyBlockingQueue0524(int capacity){
        table = new Object[capacity];
    }

    public synchronized void put(T element) throws InterruptedException {
        while (size == table.length)
            wait();
        table[putIndex] = element;//存放元素
        putIndex = ( putIndex+1)%table.length;
        size++;
        notifyAll();
        Thread.sleep(500);

    }

    public synchronized T take() throws InterruptedException {
        while (size == 0)
            wait();
        Object element = table[takeIndex];//取元素
        takeIndex = (takeIndex+1)%table.length;
        size--;
        notifyAll();
        Thread.sleep(500);
        return (T)element;
    }

    //不可以使用volatile不加锁的方式完成size
    //如果
    public synchronized int size(){
        return size;
    }
    //模拟自定义阻塞队列
    public static void main(String[] args) {
        MyBlockingQueue0524<Integer> queue0524 = new MyBlockingQueue0524(100);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while (true) {//加锁保证其原子性,
                    //模拟生产面包
                    synchronized (queue0524) {
                        try {
                            queue0524.put(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("存放面包+1" + "总数" + queue0524.size());
                    }
                }
            }).start();
        }
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                while (true) {
                    synchronized (queue0524) {
                        //模拟消费面包
                        try {
                            Integer e = queue0524.take();
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        System.out.println("消费面包-1" + "总数" + queue0524.size());
                    }
                }
            }).start();
        }
    }
}
