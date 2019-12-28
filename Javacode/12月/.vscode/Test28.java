import java.util.Scanner;
public class Test28{//求一个整数，在内存当中存储时，二进制1的个数。
    public static void main(String[] args){
        int i=1;
        int count=0;
        System.out.println("请输入你要查的整数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i!=0){
            if((n&i)!=0){
            count++;
        }
        i<<=1;
        }
        System.out.println(count);
    sc.close();
    }
}
import java.util.Scanner;
public class Test28{//最大公约数
    public static void main(String[]args){
        System.out.println("请输入两个数:");
        Scanner sc=new Scanner(System.in);
        int one=sc.nextInt();
        int two=sc.nextInt();
        int i=0;
        if(one>two){
            int tmp=one;
            one=two;
            two=tmp;
        }
        for(i=two-1;i>1;i--){
            if(two%i==0&&one%i==0){
            System.out.println("最大公约数为"+i);
            break;
        }
        }
        if(i==1){
            System.out.println("最大公约数为1");
        }       
    }
}
public class Test28{//求1/1-1/2+1/3 … + 1/99 - 1/100
    public static void main(String[] args){
        double count=0;
        double i=0;
        double n=-1;
        for(i=1;i<101;i++){
            count=(-1)*(n/i)+count;
            n=-n;
        }
        System.out.println(count);
}
}
public class Test28{//水仙花数
    public static void main(String[] args){
        for(int i=0;i<1000;i++)
        if((i%10)*(i%10)*(i%10)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i/100)*(i/100)*(i/100)==i){
            System.out.println(i);
        }                                                
}
}
import java.util.Scanner;
public class Test28{//猜数字游戏
public static void main(String[] args){
    int ran = (int) (Math.random() * 100 + 1);
    System.out.println("请输入你要猜的数字:");
    Scanner sc=new Scanner(System.in);
    while(true){
    int num=sc.nextInt();
    if(num>ran){
        System.out.println("猜大了!");
    }
    else if(num<ran){
        System.out.println("猜小了!");
    }
    else{
        System.out.println("猜对了!");
        break;
    }
    }
}
}