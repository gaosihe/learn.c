import frank.Duck;
import frank.Duck2;
import frank.Duck3;
import frank.DuckShop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //spring开启容器得方式ApplicationContext 应用上下文(可以配值并管理Bean对象,及其他得工作)
        // ClassPathXmlApplicationContext根据classpath路径,指定一个xml文件(配置文件)
        // 并根据配置文件完成配置工作创建一个.
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        //通过bean的名称(id)获取bean对象
//        String bit =(String) context.getBean("bit");
//        String bit2= (String) context.getBean("java.lang.String#0");
//        System.out.println(bit);
//        System.out.println(bit2);
        //通过类型获取bean对象
//        String bit2 = context.getBean(String.class);
//        System.out.println(bit2);

        Duck d1 = (Duck) context.getBean("d1");
        System.out.println(d1);
        Duck2 d2 = (Duck2) context.getBean("d2");
        System.out.println(d2);
        Duck3 dk1 = (Duck3) context.getBean("dk1");
        System.out.println(dk1);

        DuckShop shop = (DuckShop) context.getBean("shop");
        System.out.println(shop);
    }
}