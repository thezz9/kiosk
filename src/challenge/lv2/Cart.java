package challenge.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cart {

    private List<MenuItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addCart(MenuItem menuItem) {
        cartItems.add(menuItem);
    }

    public List<MenuItem> getCartItems() {
        return cartItems;
    }

    public void clearCart() {
        cartItems.clear();
    }

    /**
     * 장바구니 내 상품 출력 및 총 금액 계산 (람다, 스트림, 반올림 적용)
     */
    public double getTotalPrice() {
        double totalPrice = IntStream.range(0, getCartItems().size())
                .peek(i -> {
                    MenuItem item = getCartItems().get(i);
                    System.out.println((i + 1) + ". " + item.getName() + " | W " +
                            item.getPrice() + " | " + item.getDescription());
                })
                .mapToDouble(i -> getCartItems().get(i).getPrice())
                .sum();

        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        System.out.println("[ TOTAL ]");
        System.out.println("W " + totalPrice);
        return totalPrice;
    }

    /**
     * 유형별 할인율에 따른 총 금액 계산 (반올림 적용)
     */
    public double getDiscountPrice(int discountChoice, double totalPrice) {
        switch (discountChoice) {
            case 1:
                totalPrice = totalPrice - (totalPrice * Discount.veteran.getDiscount());
                break;
            case 2:
                totalPrice = totalPrice - (totalPrice * Discount.soldier.getDiscount());
                break;
            case 3:
                totalPrice = totalPrice - (totalPrice * Discount.student.getDiscount());
                break;
            case 4:
                break;
        }
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        return totalPrice;
    }

    /**
     * 장바구니 선택 삭제 메서드 (itemIndex: 상품 번호)
     */
    public void removeCartItem(int itemIndex) {
        cartItems = IntStream.range(0, cartItems.size()) // 인덱스 생성
                .filter(i -> i != itemIndex - 1) // 삭제할 itemIndex가 아닌 요소만 유지
                .mapToObj(cartItems::get) // 해당 인덱스의 cartItems 요소를 가져옴
                .collect(Collectors.toList()); // 필터링된 요소를 새로운 리스트로 변환
        System.out.println("상품이 삭제되었습니다.");
    }
}
