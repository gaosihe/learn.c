package book0309.action;

import book0309.book.Book;
import book0309.book.BookList;

import java.io.StringReader;
import java.util.Scanner;

public class BorrowAction implements  IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入借的书名:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //先找到要借的书,把书的状态改成"借出"即可
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                if(book.isBorrowed()){
                    continue;
                }else{
                    book.setBorrowed(true);
                    System.out.println("借书成功");
                    return;
                }
            }
        }
        System.out.println("借书失败!没有匹配的书籍!");
    }
}