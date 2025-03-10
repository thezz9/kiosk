package required.lv45;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final List<Menu> menus;

    public Kiosk() {
        this.menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");

            // 사용자 입력 받기
            System.out.print("카테고리 번호를 입력하세요: ");
            int categoryChoice = getValidInput(sc, menus.size());

            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Menu selectedMenu = menus.get(categoryChoice - 1);
            menuSelection(sc, selectedMenu);

        } while (true);
    }
    private void menuSelection(Scanner sc, Menu menu) {
        do {
            menu.displayItems();
            System.out.print("메뉴 번호를 입력하세요: ");
            int itemChoice = getValidInput(sc, menu.getMenuItems().size());

            if (itemChoice == 0) {
                return; // 뒤로 가기
            }

            MenuItem selectedItem = menu.getMenuItems().get(itemChoice - 1);
            System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " +
                    selectedItem.getPrice() + " | " + selectedItem.getDescription());
        } while (true);
    }

    private int getValidInput(Scanner sc, int maxOption) {
        int categoryChoice;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.next();
                continue;
            }
            categoryChoice = sc.nextInt();
            if (categoryChoice >= 0 && categoryChoice <= maxOption) {
                return categoryChoice;
            } else {
                System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        }
    }
}
