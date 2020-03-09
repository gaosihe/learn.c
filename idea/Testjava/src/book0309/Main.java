package book0309;

import book0309.book.BookList;
import book0309.user.Admin;
import book0309.user.NormalUser;
import book0309.user.User;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //1.先把数据准备好
        BookList bookList = new BookList();
        //2.创建用户,进行登录
        User user = login();
        //3.进入主循环
        while(true) {
            int choice = user.menu();
            user.doAction(choice,bookList);
            //4.循环内部调用menu方法显示菜单
            //5.根据用户输入的选项来决定执行哪个IAction完成操作
        }
    }
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的身份:1表示管理员 2表示普通用户");
        int who = scanner.nextInt();
        if(who==1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
