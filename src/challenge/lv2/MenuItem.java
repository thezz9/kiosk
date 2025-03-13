package challenge.lv2;

public class MenuItem {
    private final String name;
    private final double price;
    private final String description;

    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%-12s | W %-4.1f| %s", name, price, description);
    }
}
