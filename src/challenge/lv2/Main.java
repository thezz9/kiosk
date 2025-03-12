package challenge.lv2;

public class Main {
    public static void main(String[] args) {

        Menu burgerMenu = MenuFactory.setMenu("Burgers");
        Menu drinkMenu = MenuFactory.setMenu("Drinks");
        Menu dessertMenu = MenuFactory.setMenu("Desserts");

        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgerMenu);
        kiosk.addMenu(drinkMenu);
        kiosk.addMenu(dessertMenu);

        kiosk.start();

    }
}
