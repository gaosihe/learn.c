import java.util.Scanner;
public class Test25{//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.println("请输入你查询的年龄:");  
        int age = in.nextInt();
        if(age>=0&&age<=18){
            System.out.println("少年");
        }
        else if(age>=19&&age<=28){
            System.out.println("青年");
        }
        else if(age>=29&&age<=55){
            System.out.println("中年");
        }
        else if(age>=56){
            System.out.println("老年");
        }
        else{
            System.out.println("你的输入有误!");
        }  
    }
}
import java.util.Scanner;//判断素数
public class Test25{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("请输入你查询的数:");  
    int prime =in.nextInt();
    int i=0;
    for(i=2;i<prime;i++){
        if(prime % i==0){
            System.out.println("不是素数");
            break;
        }
        else
        {
            System.out.println("是素数");
            break;
        }
    }
}
}
public class Test25{//打印1-100素数
public static void main(String[] args){
    for(int j=1;j<101;j++){
    for(int i=2;i<j;i++){
        if(j % i==0){
            break;        
        }
        if(i==j-1){
            System.out.println(j);
            break;
        } 
    }  
}
}
}
public class Test25{//打印1000-2000的闰年
public static void main(String[] args){
    for(int i=1000;i<2001;i++){
        if(i % 4==0&&i%100!=0||i%400==0){
            System.out.println(i);
        } 
    }  
}
}
public class Test25{//打印1-100出现多少个数字9
public static void main(String[] args){
    int count=0;
    for(int j=1;j<101;j++){
        if(j %10 ==9){
                 count++;
        }
        
        if(j/10==9){
            count++;
        } 
    }  
     System.out.println(count);
}
}
