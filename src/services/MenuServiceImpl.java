package services;

import utils.MenuUtil;
import utils.PrintValueUtil;
import services.interfaces.MenuService;

public class MenuServiceImpl implements MenuService {
    String menu = """
            Choose an option:\s
            1. Create an author\s
            2. Show all authors\s
            3. Delete an author\s
            4. Create a book\s
            5. Show all books\s
            6. Delete a book\s
            7. Create user\s
            8. Show all users\s
            9. Delete user\s
            """;

    @Override
    public void process() {
        showMenu();
    }

    public MenuService chooseMenu() {
        int selectedOption = PrintValueUtil.printIntValue(menu);
        return MenuUtil.chooseMenu(selectedOption);
    }

    public void showMenu() {
        MenuUtil.showMenu(chooseMenu());
        MenuUtil.showMenu(this);
    }
}
