package Test0201;
public class Test0203 {// 1
    public static void main(String[] args) {
        //test000();
        //test111();
        //test222();
        //test333();
        //test444();
        test555();
    }
    private static int x = 100;// 2
//    public static void test000() {// 3
//        Test0203 hsl = new Test0203();// 4
//        hsl.x++;// 5
//        Test0203 hs2 = new Test0203();// 6
//        hs2.x++;// 7
//        hsl = new Test0203();// 8
//        hsl.x++;// 9
//        Test0203.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }
    public static void hello() {
        System.out.println("hello");
    }

    public static void test111() {
        // TODO Auto-generated method stub
        Test0203 test=null;
        test.hello();
    }
    public static int aMethod(){
         int i = 0;
        i++;
        return i;
    }
//    public static void test222(){
//        Test0203 test = new Test0203();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
    static boolean Paddy;
    public static void test333(){
        System.out.println(Paddy);
    }
    private int count;
    public static void test444() {
        Test0203 test=new Test0203(88);
        System.out.println(test.count);
    }
    Test0203(int a) {
        count=a;
    }
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void test555(){
        System.out.println("cnt ="+ cnt);
    }
    static{
        cnt /=3;
    }
}



