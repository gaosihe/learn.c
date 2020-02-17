package Test0105;

public class Test0107 {
    private static void testAddFirst() {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.remove(2);
        linkedList.dispaly();
    }

    public static void main(String[] args) {
        testAddFirst();
    }
}