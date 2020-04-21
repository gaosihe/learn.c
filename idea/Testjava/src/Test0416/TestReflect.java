package Test0416;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Animal{
    public void eat(String food){

    }
}
class Cat extends Animal{
    private String name;

    public Cat(){//解决错误(///)
        this.name="小猫";
    }
    public Cat(String name){
        this.name = name;
    }

    public void eat(String food)
    {
        System.out.println(this.name+" 正在吃 "+food);
    }
}
class Bird extends Animal{
    private String name;

    public Bird(){
        name="小鸟";
    }
    public void eat(String food){
        System.out.println(this.name+" 正在吃 "+food);
    }
}
public class TestReflect {//反射
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //1.如何获取类对象
//        //1)通过字符来获取到类,参数是类的全限定类名
//        //catClass就是Cat类的图纸,里面描述了Cat类的内部构造
//        Class catClass = Class.forName("Test0416.Cat");
//        //2)通过实例来获取,实例的getClass方法获取到类对象
//        Cat cat =new Cat("小黑");
//        Class catClass2 = cat.getClass();
//        //得到的类对象在内存中只有一份,所以本质上是同一个对象
//        System.out.println(catClass==catClass2);
//
//        //3)通过类来获取
//        Class catClass3= Cat.class;
//        System.out.println(catClass==catClass3);

//        //以下代码运行时出现了异常,Cat类没有提供无参数的构造方法啊
//        //直接实例化就会出错(///)
//        Class catClass = Class.forName("Test0416.Cat");
//        Cat cat = (Cat) catClass.newInstance();
//        cat.eat("鱼");

//        Scanner scanner = new Scanner(System.in);
//        String className=scanner.next();
//        System.out.println("您要创建的实例类型为:"+className);
//
//        Class catClass = Class.forName(className);
//        Animal animal = (Animal) catClass.newInstance();
//        animal.eat("鱼");

        //3.通过反射获取/修改属性(可以修改private的属性)
//        Class catClass = Class.forName("Test0416.Cat");
//        //Cat类中包含name属性,private的属性,此时想关注局部的name信息
//        //通过getDeclaredField能得到局部内容,通过Fieid对象来表示
//        Field field = catClass.getDeclaredField("name");
//        //当name为private的时候,同时又没有getter setter
//        // 可以借助  反射 打破封装
//        field.setAccessible(true);//访问private成员,还可以修改属性
//
//        Cat cat =new Cat();
//        field.set(cat,"小喵喵");//这里相当于cat.name="小喵喵"
//        //拿着图纸中的局部信息,拆开cat对象,看看里面是啥
//        String name= (String) field.get(cat);//这里相当于cat.name
//        System.out.println(name);
        //4.通过反射获取到类的方法
//        Class catClass = Class.forName("Test0416.Cat");
//        //根据catClass这个图纸,找到Cat类中的eat方法
//        //方法是可以重载的,就可以通过后续的变长参数列表来指定,要获取哪个版本的eat
//        //下面的代码是指获取到 只有一个参数 且类型为String 的eat方法
//        Method method = catClass.getMethod("eat",String.class);
//
//        Cat cat = new Cat();
//        method.invoke(cat,"猫粮");
        //5.获取构造方法,借助构造方法来实例化对象
//        Class catClass = Class.forName("Test0416.Cat");
//        //获取到Cat类中,只有一个参数且类型为String的构造方法
//        Constructor constructor = catClass.getConstructor(String.class);
//        Cat cat = (Cat)constructor.newInstance("小黑");
//        cat.eat("鱼🐟");
    }
}






