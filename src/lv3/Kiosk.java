package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<MenuItem> menuItems = new ArrayList<>();

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " | W "
                        + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 종료      | 종료");

            // 사용자 입력 받기
            System.out.print("메뉴 번호를 입력하세요: ");
            int choice;

            // 숫자가 아닌 값 입력 시 예외 처리
            if (!sc.hasNextInt()) {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            // 입력된 숫자에 따른 처리
            if (choice == 0) {
                // 프로그램을 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menuItems.size()) {
                // 선택한 메뉴 : 이름, 가격, 설명
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " +
                        selectedItem.getPrice() + " | " + selectedItem.getDescription());
            } else {
                System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        } while (true);

        sc.close();

    }
}
