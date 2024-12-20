package model;

public class Book {
    private String title;
    private Author author;
    private User[] users;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Book's title: " + title + ", author: " + author;
    }

}
