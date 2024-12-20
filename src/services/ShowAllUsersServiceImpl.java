package services;

import config.Configuration;
import model.User;
import services.interfaces.ShowAllUsersService;

public class ShowAllUsersServiceImpl implements ShowAllUsersService {
    Configuration configuration = Configuration.getInstance();
    User[] users = configuration.getUsers();
    int length = users.length;

    @Override
    public void process() {
        showAllUsers();
    }

    public void showAllUsers() {
        checkUsers();
        for (int i = 0; i < length; i++) {
            System.out.println("Index is " + i + " | " + users[i]);
        }
    }

    public void checkUsers() {
        if (users.length == 0) {
            System.out.println("No users found");
        }
    }
}
