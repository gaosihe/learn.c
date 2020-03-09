package book0309.user;


import book0309.action.IAction;
import book0309.book.BookList;

//User 并不需要去创建实例,真正需要创建的是NormalUser 和 Admin
abstract public class User {
    protected String name;
    //当前用户支持哪些操作
    protected IAction[ ]  actions;
    //打印一个命令行的菜单
    //普通用户和管理员分别实现各自的菜单方法
    abstract public int menu();

    //还需要一个公共每个用户需要的方法
    public void doAction(int choice, BookList bookList){
        //根据输入的选项choice,来选择合适的对象进行操作
        actions[choice].work(bookList);
    }
}
