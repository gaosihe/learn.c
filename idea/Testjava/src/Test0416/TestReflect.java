package Test0416;

class Cat{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }
}
public class TestReflect {//反射
    public static void main(String[] args) throws ClassNotFoundException {
        //1.如何获取类对象
        //1)通过字符来获取到类,参数是类的全限定类名
        //catClass就是Cat类的图纸,里面描述了Cat类的内部构造
        Class catClass = Class.forName("Test0416.Cat");
        //2)通过实例来获取,实例的getClass方法获取到类对象
        Cat cat =new Cat("小黑");
        Class catClass2 = cat.getClass();
        //得到的类对象在内存中只有一份,所以本质上是同一个对象
        System.out.println(catClass==catClass2);

        //3)通过类来获取
        Class catClass3= Cat.class;
        System.out.println(catClass==catClass3);

    }
}
