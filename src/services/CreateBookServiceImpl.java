package services;

import config.Configuration;
import model.Book;
import services.interfaces.CreateBookService;
import utils.PrintValueUtil;

public class CreateBookServiceImpl implements CreateBookService {
    Configuration configuration = Configuration.getInstance();
    Book book = new Book();

    @Override
    public void process() {
        createBook();
        addBook();
    }

    public void createBook() {
        String title = PrintValueUtil.printStringValue("Enter title of book: ");
        book.setTitle(title);
    }

    public void addBook() {
        configuration.addBook(book);
    }
}
