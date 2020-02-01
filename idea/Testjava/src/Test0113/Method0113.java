package Test0113;
import java.util.*;
import java.sql.SQLOutput;

public class Method0113 {
    public static void main(String[] args)
    {
        //multiply();
        //intly();
        //cipher();
        gsh0201();
    }
    public static void multiply(){//99乘法表
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                sum = i * j;
                System.out.printf(j + "*" + i + "=" + sum+" ");
            }
        }
    }

    public static void intly() {
        Scanner in = new Scanner(System.in);//输入一个整数
        int i = in.nextInt();
        intlys(i);
    }

    public static void intlys(int i) {//递归输出整数的每一位
        if(i>9){
            intlys(i/10);
        }
        System.out.println(i%10);
    }

    public static void cipher() {
        int password=666666;
        int j=0;
        for (j=0;j<3;) {
            Scanner in = new Scanner(System.in);//输入一个密码
            int i = in.nextInt();
            if(i==password)
            {
                System.out.println("密码正确!");
                break;
            }
            else{
                System.out.println("密码错误!");
                j++;
            }
            if(j==3){
                System.out.println("你已经错误三次,请稍后再试!!!");
            }
        }
        }

    public static void gsh0201() {//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        {
            int i = 0;
            for ( i = 31; i >= 1; i-=2)
            {
                System.out.print((k>>i) & 1);//偶数位
            }
            System.out.println();
            for ( i = 30; i >=0; i-=2)
            {
                System.out.print((k >> i) & 1);//奇数位
            }
        }
    }
}
