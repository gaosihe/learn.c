package Test0416;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC {
    private static void testInsert() throws SQLException {//数据库插入操作
        //0.准备工作,需要现在数据库中创建好数据库和数据表
        //1.创建DataSource对象,这个对象是 程序级 的,每个程序创建一个对象即可
        //"单例"
        DataSource dataSource= new MysqlDataSource();
        //2.设置datasource的属性,为何数据库建立连接做准备
        //   MySQL是个服务器,想要访问MySQL,需要知道MySQL的IP地址,端口号
        //以及要访问的数据库名,以及用户名和秘码
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java15_0506?characterEncoding=utf8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("a718a718");
        //3.创建一个Connection对象,用来表示和数据库建立了一次链接,
        Connection connection = dataSource.getConnection();
        //4.如果链接了,就可以操作数据库了,核心就是拼装SQL语句
        //?是占位符
        String sql = "insert into student values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"蔡徐坤");
        statement.setInt(2,20);
        System.out.println(statement);//拼装SQL
        //5.执行SQL
        int ret = statement.executeUpdate();
        System.out.println(ret);
        //6.释放相关资源,一定先释放statement,在释放Connection,顺序不能搞错.
        statement.close();
        connection.close();
    }
    private static void testSelect() throws SQLException {//数据库查找操作
        //0.准备库和表
        //1.创建datasource对象
        DataSource dataSource= new MysqlDataSource();
        //2.设置datasource的属性,为何数据库建立连接做准备
        //   MySQL是个服务器,想要访问MySQL,需要知道MySQL的IP地址,端口号
        //以及要访问的数据库名,以及用户名和秘码
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java15_0506?characterEncoding=utf8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("a718a718");
        //3.建立连接
        Connection connection = dataSource.getConnection();
        //4.拼装SQL语句
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        //5.此处没有问好不需要替换,直接执行即可
        //  resultSet中包含了查询结果
        ResultSet resultSet = statement.executeQuery();
        //6.遍历结果集合
        while(resultSet.next()){
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println(name + ":" + age);
        }
        //7.释放资源,顺序不能颠倒,先被创建的后释放
        resultSet.close();
        statement.close();
        connection.close();
    }
    public static void main(String[] args) throws SQLException {
        testSelect();
    }
}
