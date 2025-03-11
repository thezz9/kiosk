package challenge.lv2;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    /**
     * 숫자 검증 코드
     */
    private int getValidInput() {
        while (!sc.hasNextInt()) {
            System.out.print("올바른 숫자를 입력하세요: ");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * 유효한 숫자 검증: maxOption 파라미터로 메뉴의 범위를 전달
     */
    public int getValidInputInRange(int maxOption) {
        int menuChoice;
        while (true) {
            menuChoice = getValidInput();
            if (menuChoice >= 0 && menuChoice <= maxOption) {
                break;
            }
            System.out.print("올바른 메뉴 번호를 입력하세요: ");
        }
        return menuChoice;
    }
}
