package services;

import config.Configuration;
import model.User;
import services.interfaces.CreateUserService;
import utils.PrintValueUtil;

public class CreateUserServiceImpl implements CreateUserService {
    Configuration configuration = Configuration.getInstance();
    User user = new User();

    @Override
    public void process() {
        createUser();
        addUser();
    }

    public void createUser() {
        String fullName = PrintValueUtil.printStringValue("Enter user's full name: ");
        String email = PrintValueUtil.printStringValue("Enter user's email: ");
        user.setFullName(fullName);
        user.setEmail(email);
    }

    public void addUser() {
        configuration.addUser(user);
    }
}
