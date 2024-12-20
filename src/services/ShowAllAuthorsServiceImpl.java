package services;

import config.Configuration;
import model.Author;
import services.interfaces.ShowAllAuthorsService;

public class ShowAllAuthorsServiceImpl implements ShowAllAuthorsService {
    Configuration configuration = Configuration.getInstance();
    Author[] authors = configuration.getAuthors();
    int length = authors.length;

    @Override
    public void process() {
        showAllAuthors();
    }

    public void showAllAuthors() {
        checkAuthors();
        for (int i = 0; i < length; i++) {
            System.out.println("Index is " + i + " | " + authors[i]);
        }
    }

    public void checkAuthors() {
        if (length == 0) {
            System.out.println("No authors found");
        }
    }
}
