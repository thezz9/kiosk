package required.lv45;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final String category;
    private final List<MenuItem> menuItems;

    public Menu(String category) {
        this.category = category;
        // 생성자가 호출될 때마다 새로운 리스트 객체 생성
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void displayItems() {
        System.out.println("[ " + category + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " | W "
                    + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println("0. 뒤로가기");
    }
}
