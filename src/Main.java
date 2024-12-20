import services.MenuServiceImpl;
import utils.MenuUtil;

public class Main {
    public static void main(String[] args) {
        MenuUtil.showMenu(new MenuServiceImpl());
    }
}