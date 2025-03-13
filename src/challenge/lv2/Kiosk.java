package challenge.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Kiosk {

    private final List<Menu> menus;
    private final Cart cart = new Cart();
    private final Input input = new Input();

    public Kiosk() {
        this.menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    /**
     * 키오스크 실행 구간
     */
    public void start() {
        do {
            // 메뉴 확장 시 입력값 검증의 유연함을 위해 변수 사용
            int menuSize = menus.size();
            // 메인 메뉴 출력 시 람다, 스트림 적용
            System.out.println("[ MAIN MENU ]");
            IntStream.range(0, menuSize)
                    .mapToObj(i -> (i + 1) + ". " + menus.get(i).getCategory())
                    .forEach(System.out::println);

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
            int categoryChoice = input.getValidInputInRange(menuSize);
            switch (categoryChoice) {
                case 0: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                case 4: // 장바구니
                    while (true) {
                        double totalPrice = cart.getTotalPrice();
                        System.out.println("1. 주문      2. 메뉴판      3. 삭제");
                        System.out.print("원하는 번호를 입력하세요: ");
                        int confirm = input.getValidInputInRange(3);

                        if (confirm == 1) { // 주문
                            System.out.println("1. 국가유공자 : 10%\n2. 군인 : 5%\n3. 학생 : 3%\n4. 일반 : 0%");
                            System.out.print("해당하는 번호를 입력하세요: ");
                            totalPrice = cart.getDiscountPrice(input.getValidInputInRange(Discount.values().length), totalPrice);
                            System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + "입니다.");
                            cart.clearCart();
                            break;
                        } else if (confirm == 3) { // 삭제
                            cart.getTotalPrice();
                            System.out.print("삭제할 상품 번호를 입력하세요: ");
                            int itemIndex = input.getValidInputInRange(cart.getCartItems().size());
                            cart.removeCartItem(itemIndex);
                            if (cart.getCartItems().isEmpty()) {
                                break;
                            }
                        } else { // 메뉴판
                            break;
                        }
                    }
                    break;
                case 5: // 초기화
                    System.out.println("주문이 취소되었습니다.");
                    cart.clearCart();
                    break;
                default: // 상세메뉴
                    Menu selectedMenu = menus.get(categoryChoice - 1);
                    menuSelection(selectedMenu);
            }
        } while (true);
    }

    /**
     * 메뉴아이템 선택 & 장바구니 추가
     */
    private void menuSelection(Menu menu) {
        do {
            menu.displayItems();
            System.out.print("메뉴 번호를 입력하세요: ");
            int itemChoice = input.getValidInputInRange(menu.getMenuItems().size());

            if (itemChoice == 0) {
                return; // 뒤로 가기
            }

            MenuItem selectedItem = menu.getMenuItems().get(itemChoice - 1);
            System.out.println("선택한 메뉴: " + selectedItem);
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인      2. 취소");
            System.out.print("원하는 번호를 입력하세요: ");
            int confirm = input.getValidInputInRange(2);
            if (confirm == 1) {
                cart.addCart(selectedItem);
                System.out.println(selectedItem.getName().trim() + "이 장바구니에 추가되었습니다.");
            }
        } while (true);
    }

}
