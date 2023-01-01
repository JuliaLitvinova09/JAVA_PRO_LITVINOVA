package homework26.service;

import homework26.dao.BookDao;
import homework26.model.Book;

import java.util.List;

public class BookService {
    private BookDao BookDao = new BookDao();

    public void save(Book book) {
        if (book == null) {
            System.out.println("book is null");
        }
        BookDao.save(book);
    }

    public void update(Book book) {
        if (book == null) {
            System.out.println("book is null");
        }
        BookDao.update(book);
    }

    public void delete(Book book) {
        if (book == null) {
            System.out.println("book is null");
        }
        BookDao.delete(book);
    }

    public Book getById(int id) {
        Book book = BookDao.getById(id);
        return book;
    }

    public List<Book> getAll() {
        return BookDao.getAll();
    }

}
