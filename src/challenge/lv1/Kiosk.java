package challenge.lv1;

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

    Cart cart = new Cart();
    Scanner sc = new Scanner(System.in);

    /** 키오스크 실행 구간 */
    public void start() {
        do {
            // 메뉴 확장시 입력값 검증의 유연함을 위해 변수 사용
            int menuSize = menus.size();
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menuSize; i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }

            // 장바구니가 비어있으면 메뉴 미출력
            if (!cart.getCartItems().isEmpty()) {
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                menuSize = menuSize + 2;
            }
            System.out.println("0. 종료      | 종료");

            // 사용자 입력 받기
            System.out.print("카테고리 번호를 입력하세요: ");
            int categoryChoice = getValidInputInRange(menuSize);
            switch (categoryChoice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                case 4:
                    double totalPrice = cart.getTotalPrice();
                    System.out.println("1. 주문      2. 메뉴판");
                    int confirm = getValidInputInRange(2);
                    if (confirm == 1) {
                        System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + "입니다.");
                        cart.clearCart();
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    System.out.println("주문이 취소되었습니다.");
                    cart.clearCart();
                    break;
                default:
                    Menu selectedMenu = menus.get(categoryChoice - 1);
                    menuSelection(selectedMenu);
            }
        } while (true);
    }

    /** 메뉴아이템 선택 & 장바구니 추가 */
    private void menuSelection(Menu menu) {
        do {
            menu.displayItems();
            System.out.print("메뉴 번호를 입력하세요: ");
            int itemChoice = getValidInputInRange(menu.getMenuItems().size());

            if (itemChoice == 0) {
                return; // 뒤로 가기
            }

            MenuItem selectedItem = menu.getMenuItems().get(itemChoice - 1);
            System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " +
                    selectedItem.getPrice() + " | " + selectedItem.getDescription());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인      2. 취소");
            int confirm = getValidInputInRange(2);
            if (confirm == 1) {
                cart.addCart(selectedItem);
                System.out.println(selectedItem.getName().trim() + "이 장바구니에 추가되었습니다.");
            }
        } while (true);
    }

    /** 숫자 검증 코드 */
    private int getValidInput() {
        while (!sc.hasNextInt()) {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.next();
        }
        return sc.nextInt();
    }

    /** 유효한 숫자 검증: maxOption 파라미터로 메뉴의 범위를 전달 받음 */
    private int getValidInputInRange(int maxOption) {
        int menuChoice;
        while (true) {
            menuChoice = getValidInput();
            if (menuChoice >= 0 && menuChoice <= maxOption) {
                break;
            }
            System.out.println("올바른 메뉴 번호를 입력하세요.");
        }
        return menuChoice;
    }
}
