# 📄 프로젝트 개요

이 프로젝트는 사용자로부터 번호를 입력받아 진행하는 간단한 키오스크 로직을 구현하는 프로그램입니다.<br>
사용자가 메뉴를 선택하고 장바구니에 담은 후 결제까지 진행하는 흐름을 처리합니다.

## 클래스 정의
- Main : 시작 지점이 되는 클래스
- MenuItem : 메뉴의 세부 속성들을 가지는 클래스
- Kiosk : 프로그램 순서 및 흐름 제어를 담당하는 클래스
- Menu : menuItems의 상위 카테고리를 관리하는 클래스
- Cart : 장바구니를 관리하는 클래스
- Input : 입력값을 검증하는 클래스

## 📌 요구 사항

### **필수 Lv.1 ✔️**
- 실행 시 햄버거 메뉴가 표시되고 입력받은 숫자에 따라 다른 로직을 실행
- 특정 문자열을 입력하기 전까지 무한 반복
- `Scanner` 클래스를 사용해 사용자 입력 처리

### **필수 Lv.2 ✔️**
- 개별 음식 항목을 관리하는 `MenuItem` 클래스 생성
- `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 저장
- `menuItems` 리스트를 탐색하며 반복적으로 출력

### **필수 Lv.3 ✔️**
- 프로그램 메뉴를 관리하고 사용자 입력을 처리하는 `Kiosk` 클래스 생성
- 기존 `main`함수에서 관리하던 입력 및 반복문 로직을 `start` 함수에서 관리
- `main` 함수에서 `Kiosk` 객체를 생성할 때 값을 할당
- 유효하지 않은 입력에 대한 오류 메시지 출력
- `뒤로가기` 및 `종료` 기능 구현

### **필수 Lv.4 ✔️**
- `MenuItem` 클래스를 관리하는 `Menu` 클래스 생성
- 여러 `menuItem`을 포함하는 `카테고리 이름` 필드 추가
- 메뉴 카테고리 이름을 반환하는 메서드 구현

### **필수 Lv.5 ✔️**
- 각 클래스의 필드에 직접 접근하지 못하도록 캡슐화 적용

### **도전 Lv.1 ✔️**
- 장바구니를 관리하는 `Cart` 클래스 생성 **(기존 요구사항엔 없음)**
- 사용자가 선택한 메뉴를 장바구니에 추가하는 기능 구현
- 결제 전 장바구니 내 모든 메뉴 및 총 금액 출력
- 주문 완료 또는 주문 취소 시 장바구니 초기화

### **도전 Lv.2 ✔️** 
- 입력값을 검증하는 `Input` 클래스 생성 **(기존 요구사항엔 없음)**
- `Enum`을 활용해 사용자 유형별 할인율 관리
- 람다 & 스트림을 활용한 장바구니 조회 기능 추가
- 특정 메뉴를 제외하고 출력하는 기능 구현
  
## 사용 방법
1. 프로그램을 실행하면 메인 메뉴가 표시됩니다. 🚀
2. 숫자 입력으로 원하는 카테고리를 선택합니다.
3. 선택한 메뉴를 장바구니에 담으려면 1번을, 메인 메뉴로 돌아가려면 0번을 입력합니다.
4. 장바구니에 담긴 항목을 확인하려면 4번을, 주문을 취소하려면 5번을 입력합니다.
5. 장바구니에서 주문을 완료하려면 1번을, 더 담으려면 2번을 눌러 메인 메뉴로 돌아갑니다.
6. 프로그램을 종료하려면 0번을 입력하여 종료합니다.

## 코드 실행 예시

![image](https://github.com/user-attachments/assets/b1b5f857-c5b9-48e9-ab29-9ff50d3c7006)
![image](https://github.com/user-attachments/assets/45348522-05e8-4042-af06-2432d1bde254)

## 개발 환경

- **Java JDK 17** ☕

## 블로그
[Velog](https://velog.io/@harvard--/Java-%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EB%A6%AC%ED%8C%A9%ED%86%A0%EB%A7%81)
