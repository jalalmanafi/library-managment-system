package services;

import config.Configuration;
import model.Author;
import services.interfaces.DeleteAuthorService;
import utils.ArrayUtil;
import utils.PrintValueUtil;

public class DeleteAuthorServiceImpl implements DeleteAuthorService {
    Configuration configuration = Configuration.getInstance();
    Author[] authors = configuration.getAuthors();

    @Override
    public void process() {
        deleteAuthor();
    }

    public void deleteAuthor() {
        checkAuthors();
        int choosedIndex = PrintValueUtil.printIntValue("Please write index of element that should removed");
        ArrayUtil.removeElement(authors, choosedIndex);
    }

    public void checkAuthors() {
        if (authors.length == 0) {
            System.out.println("There is nothing to delete");
        }
    }
}
