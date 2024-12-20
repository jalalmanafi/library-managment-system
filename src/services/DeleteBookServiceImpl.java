package services;

import config.Configuration;
import model.Book;
import services.interfaces.DeleteBookService;
import utils.ArrayUtil;
import utils.PrintValueUtil;

public class DeleteBookServiceImpl implements DeleteBookService {
    Configuration configuration = Configuration.getInstance();
    Book[] books = configuration.getBooks();

    @Override
    public void process() {
        deleteBook();
    }

    public void deleteBook() {
        checkBooks();
        int choosedIndex = PrintValueUtil.printIntValue("Please write index of element that should removed");
        ArrayUtil.removeElement(books, choosedIndex);
    }

    public void checkBooks() {
        if (books.length == 0) {
            System.out.println("There is no books to delete");
        }
    }
}
