package Test.Test4;

public class Recent_ancestors0714 {

    public static void main(String[] args) {
        int a = getLCA(4, 7);
        System.out.println(a);
    }
        public static int getLCA(int a, int b){
            // write code here
            if (b > a) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            if (a == b) {
                return a;
            } else {
                return getLCA(a / 2, b);
            }
    }
}
