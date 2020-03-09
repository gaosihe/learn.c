package book0309.action;

import book0309.book.Book;
import book0309.book.BookList;

import java.util.Scanner;

public class FindAction  implements IAction{
    @Override
    public void work(BookList bookList) {
        //根据名字找到书籍信息
        System.out.println("请输入查的书名:");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.next();
        for(int i =0;i< bookList.getSize();i++){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
            }
        }
    }
}
