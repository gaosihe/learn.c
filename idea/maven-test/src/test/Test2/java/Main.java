public class Main {
    public static void main(String[] args) throws Exception{
        // 父加载器为空，使用Bootstrap ClassLoader加载
        System.out.println(new MyClassLoader(null).getParent());//null

        // 无参构造方法，会使用AppClassLoader作为父类加载器
        System.out.println(new MyClassLoader());
        System.out.println(new MyClassLoader().getParent());//App
        System.out.println(new MyClassLoader().getParent().getParent());//Ext
        System.out.println(new MyClassLoader().getParent().getParent().getParent());//null
        // 父加载器默认为AppClassLoader，使用loadClass方法加载类，从上往下加载
        Class<?> cls = new MyClassLoader().loadClass("Person");

        // 使用loadClass遵循双亲委派机制从上往下加载，会加载到jdk的String
        Class<?> stringClazz = new MyClassLoader().loadClass("java.lang.String");
        String abc = (String) stringClazz.getConstructor(String.class)
                .newInstance("ABC");
        System.out.println(abc);

        //出现异常：不能自定义java.开头的包
        Class<?> stringClazz2 = new MyClassLoader().findClass("java.lang.String");
    }
}