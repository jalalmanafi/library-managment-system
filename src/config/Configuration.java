package config;

// Single object that act like DB, it will store every item
// It is not a proper way, because it will cause some issues with multithreading

import model.Author;
import model.Book;
import model.User;

public class Configuration {
    private static Configuration configuration;
    private Book[] books = new Book[0];
    private User[] users = new User[0];
    private Author[] authors = new Author[0];


    private Configuration() {
    }

    public static Configuration getInstance() {
        if (configuration == null) {
            configuration = new Configuration();
        }
        return configuration;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[newBooks.length - 1] = book;
        this.books = newBooks;
    }

    public void addAuthor(Author author) {
        Author[] newAuthors = new Author[authors.length + 1];
        for (int i = 0; i < authors.length; i++) {
            newAuthors[i] = authors[i];
        }
        newAuthors[newAuthors.length - 1] = author;
        this.authors = newAuthors;
    }

    public void addUser(User user) {
        User[] newUsers = new User[users.length + 1];
        System.arraycopy(users, 0, newUsers, 0, users.length);
        newUsers[newUsers.length - 1] = user;
        this.users = newUsers;
    }
}
