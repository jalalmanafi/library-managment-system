package utils;

import services.*;
import services.interfaces.MenuService;

public class MenuUtil {

    public static MenuService chooseMenu(int i) {
        return getMenuService(i);
    }

    public static MenuService getMenuService(int i) {
       return switch (i) {
            case 1 -> new CreateAuthorServiceImpl();
            case 2 -> new ShowAllAuthorsServiceImpl();
            case 3 -> new DeleteAuthorServiceImpl();
            case 4 -> new CreateBookServiceImpl();
            case 5 -> new ShowAllBooksServiceImpl();
            case 6 -> new DeleteBookServiceImpl();
            case 7 -> new CreateUserServiceImpl();
            case 8 -> new ShowAllUsersServiceImpl();
            default -> new MenuServiceImpl();
        };
    }

    public static void showMenu(MenuService menuService) {
        menuService.process();
    }
}
