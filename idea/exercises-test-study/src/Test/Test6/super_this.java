package Test.Test6;
/**引用父类构造函数
 this与super的区别
 super: 它引用当前对象的直接父类中的成员（用来访问直接父类中被隐藏的父
 类中成员数据或函数，基类与派生类中有相同成员定义时如：super.变量名
 super.成员函数据名（实参）
 this：它代表当前对象名（在程序中易产生二义性之处，应使用this来指明当前
 对象；如果函数的形参与类中的成员数据同名，这时需用this来指明成员变量
 名）
 super（参数）：调用父类中的某一个构造函数（应该为构造函数中的第一条语
 句）。
 this（参数）：调用本类中另一种形式的构造函数（应该为构造函数中的第一条
 语句）。
 super()和this()类似,区别是，super()在子类中调用父类的构造方法，this()在本
 类内调用本类的其它构造方法。
 super()和this()均需放在构造方法内第一行。
 this和super不能同时出现在一个构造函数里面，因为this必然会调用其它的构
 造函数，其它的构造函数必然也会有super语句的存在，所以在同一个构造函数
 里面有相同的语句，就失去了语句的意义，编译器也不会通过。
 this()和super()都指的是对象，所以，均不可以在static环境中使用。包括：
 static变量,static方法，static语句块。
 从本质上讲，this是一个指向本对象的指针, 然而super是一个Java关键字。
 */
public class super_this {
    static class Person{
        protected String name;
        public Person(String name) {
            this.name = name;
        }
    }
    static class Student extends Person{
        private String name;
        public Student(String name, String name1) {
            super(name);

            this.name = name1;
        }
        public  void getInfo(){
            System.out.println(this.name); //Child
            System.out.println(super.name); //Father
        }
    }
    public static class Test {
        public static void main(String[] args) {
            Student s1 = new Student("Father","Child");
            s1.getInfo();
        }
    }



    static class Person2 {
        private String name;
        private int age;

        public Person2() {
        }

        public Person2(String name1) {
            this.name = name1;
        }

        public Person2(String name, int age) {
            this(name);
            this.age = age;
        }
    }
}
