package challenge.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    /**
     * 메뉴 아이템 출력 (람다, 스트림 적용)
     */
    public void displayItems() {
        System.out.println("[ " + category + " MENU ]");
        IntStream.range(0, menuItems.size())
                .mapToObj(i -> (i + 1) + ". " + menuItems.get(i).getName()
                        + " | W " + menuItems.get(i).getPrice()
                        + " | " + menuItems.get(i).getDescription())
                .forEach(System.out::println);
        System.out.println("0. 뒤로가기");
    }

}
