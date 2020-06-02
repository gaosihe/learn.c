package review.memory;

import org.junit.Test;

public class VarRef {
    private static Integer V;
    private int v2;

    public static void m1(int i){
        if(i==3) return;
        String s = new String("a");
        V=1;
        m1(++i);
    }
    @Test
    public void m1Test(){
        new Thread(()->{
            m1(1);
        }).start();
    }
    public  void m2(int i){
        if(i==3) return;
        String s = new String("b");
        V=2;
        m2(++i);
    }

    public static void main(String[] args) {
        new Thread(()->{
            m1(1);
        }).start();
        VarRef v1 = new VarRef();
        new Thread(()->{
            v1.m2(1);
        }).start();
    }
}
