package Test.Test2;
public class Test0611 {
    public static void main(String[] args) {
        int x=2,y=3;
        System.out.println(countWays(x ,y));
    }
        public static int countWays(int x, int y) {
            if(x==1||y==1){
                return 1;
            }
            return countWays(x-1,y)+countWays(x,y-1);
    }
}
