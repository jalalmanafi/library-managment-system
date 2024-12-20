package services;

import config.Configuration;
import model.User;
import services.interfaces.DeleteBookService;
import utils.ArrayUtil;
import utils.PrintValueUtil;

public class DeleteUserServiceImpl implements DeleteBookService {
    Configuration configuration = Configuration.getInstance();
    User[] users = configuration.getUsers();

    @Override
    public void process() {
        deleteUser();
    }

    public void deleteUser() {
        checkUsers();
        int choosedIndex = PrintValueUtil.printIntValue("Please write index of element that should removed");
        ArrayUtil.removeElement(users, choosedIndex);
    }

    public void checkUsers() {
        if (users.length == 0) {
            System.out.println("There is no users to delete");
        }
    }
}
