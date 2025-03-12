package challenge.lv2;

public enum Discount {
    VETERAN(1, 0.10),
    SOLDIER(2, 0.05),
    STUDENT(3, 0.03),
    GENERAL(4, 0);

    private final int discountChoice;
    private final double discount;

    Discount(int discountChoice, double discount) {
        this.discountChoice = discountChoice;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public int getDiscountChoice() {
        return discountChoice;
    }

    public static double getDiscountForChoice(int discountChoice) {
        for (Discount dc : Discount.values()) {
            if (dc.getDiscountChoice() == discountChoice) {
                return dc.getDiscount();
            }
        }
        return GENERAL.discount;
    }
}