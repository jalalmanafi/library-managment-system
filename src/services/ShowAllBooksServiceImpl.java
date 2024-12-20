package services;

import config.Configuration;
import model.Book;
import services.interfaces.ShowAllBooksService;

public class ShowAllBooksServiceImpl implements ShowAllBooksService {
    Configuration configuration = Configuration.getInstance();
    Book[] books = configuration.getBooks();
    int length = books.length;

    @Override
    public void process() {
        showAllBooks();
    }

    public void showAllBooks() {
        checkBooks();
        for (int i = 0; i < length; i++) {
            System.out.println("Index is " + i + " | " + books[i]);
        }
    }

    public void checkBooks() {
        if (length == 0) {
            System.out.println("No books found");
        }
    }
}
