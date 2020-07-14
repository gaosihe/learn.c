package gc.log;

/**
 * JVM参数如下:
 * -XX:+PrintGCDetails -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 * @author 38134
 *
 */
 public class OldToTenured {
    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
// 什么时候进入老年代取决于XX:MaxTenuringThreshold的设置
        allocation2 = new byte[4 * _1MB];
        //e区8m，不足存放新创建对象：Minor GC
        //回收前：e区存放allocation1，2
        //回收后：老年代存放allocation1，2
        //创建allocation3：存放到e区
        allocation3 = new byte[4 * _1MB];

        allocation3 = null;
        //allocation3之前引用指向的对象此时就没有GC Roots引用，可回收
        // 新创建的对象也是4m，+垃圾对象4m ---> e区不能存放：触发Minor GC
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) throws Exception {
        testAllocation();
    }
}