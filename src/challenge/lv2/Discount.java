package challenge.lv2;

public enum Discount {
    veteran(0.10), soldier(0.05), student(0.03), general(0);

    private final double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

}
