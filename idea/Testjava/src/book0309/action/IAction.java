package book0309.action;

import book0309.book.Book;
import book0309.book.BookList;

public interface IAction {
    void work(BookList bookList);
}
