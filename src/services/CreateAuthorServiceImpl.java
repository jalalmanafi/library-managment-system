package services;

import config.Configuration;
import model.Author;
import services.interfaces.CreateAuthorService;
import utils.PrintValueUtil;

public class CreateAuthorServiceImpl implements CreateAuthorService {
    Configuration config = Configuration.getInstance();
    Author author = new Author();

    @Override
    public void process() {
        createAuthor();
        addAuthor();
    }

    public void createAuthor() {
        String fullName = PrintValueUtil.printStringValue("Enter author's full name: ");
        int age = PrintValueUtil.printIntValue("Enter author's age: ");
        String birthPlace = PrintValueUtil.printStringValue("Enter author's birth place: ");
        author.setFullName(fullName);
        author.setAge(age);
        author.setBirthPlace(birthPlace);
    }

    public void addAuthor() {
        config.addAuthor(author);
    }
}
