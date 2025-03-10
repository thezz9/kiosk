package challenge.lv1;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<MenuItem> cartItems;

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

    /** 장바구니에 추가된 상품 출력과 총 결제금액 출력, 나중에 곱셈을 해야할 상황을 대비해 반올림 적용 */
    public double getTotalPrice() {
        double totalPrice = 0;
        System.out.println("[ ORDERS ]");
        for (MenuItem item : getCartItems()) {
            System.out.println(item.getName() + " | W " +
                    item.getPrice() + " | " + item.getDescription());
            totalPrice = totalPrice + item.getPrice();
        }
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        System.out.println("[ TOTAL ]");
        System.out.println("W " + totalPrice);
    return totalPrice;
    }
}
