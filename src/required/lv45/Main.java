package required.lv45;

public class Main {
    public static void main(String[] args) {

        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger  ",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack   ",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger ",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger    ",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem(new MenuItem("Coke       ", 2.5, "탄산이 톡톡 터지는 코카콜라"));
        drinkMenu.addMenuItem(new MenuItem("CokeZero   ", 2.5, "제로 칼로리 버전의 코카콜라"));
        drinkMenu.addMenuItem(new MenuItem("Lemonade   ", 3.0, "상큼한 레몬이 들어간 레모네이드"));
        drinkMenu.addMenuItem(new MenuItem("Milkshake  ", 4.5, "감자튀김 찍어먹으면 맛있는 밀크쉐이크"));

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem(new MenuItem("IceCream   ", 3.5, "달콤한 바닐라 아이스크림"));
        dessertMenu.addMenuItem(new MenuItem("Brownie    ", 4.0, "진한 초코 브라우니"));
        dessertMenu.addMenuItem(new MenuItem("ApplePie   ", 3.8, "바삭한 애플파이"));
        dessertMenu.addMenuItem(new MenuItem("Waffle     ", 3.5, "와플의 본고장 벨기에식 와플"));

        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgerMenu);
        kiosk.addMenu(drinkMenu);
        kiosk.addMenu(dessertMenu);

        kiosk.start();

    }
}
