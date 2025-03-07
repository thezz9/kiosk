package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger  ",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack   ",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger ",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger    ",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
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

            // 숫자 입력 받기
            System.out.print("메뉴 번호를 입력하세요: ");
            int choice = sc.nextInt();
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



    }
}
