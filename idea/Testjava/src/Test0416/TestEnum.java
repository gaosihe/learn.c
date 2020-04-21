package Test0416;

import java.util.Arrays;

public class TestEnum {//枚举
    //可以约定1为男性2为女性3为其他
//    public static final int MALE = 1;
//    public static final int FEMALE = 2;
//    public static final int OTHER = 3;

    public static void main(String[] args) {

        //这个代码是没意义的,但是仍能编译,所以用到枚举
        //int ret = MALE+100;
//        System.out.println(Arrays.toString(Sex.values()));
//        System.out.println(Sex.values().length);
        Sex sex= Sex.valueOf("MALE");
        if (sex== Sex.MALE){
            System.out.println("得到MALE类型的枚举常量");
        }
    }
}
