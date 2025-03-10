# 📄 프로젝트 개요

이 프로젝트에서는 사용자로부터 번호를 입력받아 진행하는 간단한 키오스크 로직을 구현합니다.

## 클래스 정의
- Main : 시작 지점이 되는 클래스
- MenuItem : 메뉴의 세부 속성들을 가지는 클래스
- Kiosk : 프로그램 순서 및 흐름 제어를 담당하는 클래스
- Menu : menuItems의 상위 카테고리를 관리하는 클래스
- Cart : 장바구니를 관리하는 클래스
  
## 요구 사항

### **필수 Lv.1 ✔️**
- 실행시 햄버거 메뉴가 표시되고 입력받은 숫자에 따라 다른 로직을 실행
- 특정 문자열을 입력하기 전까지 무한히 진행
- `Scanner` 클래스를 사용하여 사용자 입력을 처리

### **필수 Lv.2 ✔️**
- 개별 음식 항목을 관리하는 `MenuItem` 클래스 생성
- `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅
- 반복문을 활용해 `menuItems`를 탐색하면서 하나씩 접근해 출력

### **필수 Lv.3 ✔️**
- 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 `Kiosk` 클래스 생성
- `main`함수에서 관리하던 입력과 반복문 로직은 `start` 함수에서 관리
- `Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 할당
- 유효하지 않은 입력에 대해 오류 메시지 출력
- `뒤로가기` 및 `종료` 구현

### **필수 Lv.4 ✔️**
- `MenuItem` 클래스를 관리하는 `Menu` 클래스 생성
- 여러 menuItem을 포함하는 상위 개념의 `카테고리 이름` 필드 관리
- 메뉴 카테고리 이름을 반환하는 메서드 구현

### **필수 Lv.5 ✔️**
- 각 클래스의 필드에 직접 접근하지 못하도록 캡슐화 적용

### **도전 Lv.1 ✔️**
- 장바구니를 관리하는 `Cart` 클래스 생성
- 사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능 추가
- 사용자가 결제를 시도하기 전에, 장바구니에 담긴 모든 메뉴와 총 금액 출력
- 주문을 하거나, 주문을 취소할 시 장바구니를 초기화

### **도전 Lv.2** 
- Enum을 활용해 사용자 유형별 할인율 관리
- 람다 & 스트림을 활용한 장바구니 조회
- 특정 메뉴를 제외한 출력 기능 추가
  
## 사용 방법
1. 프로그램을 실행합니다. 🚀
2. 메인메뉴를 선택합니다.
3. 원하는 메뉴의 번호를 입력하고 1번을 입력해 장바구니에 담습니다.
4. 메인메뉴로 돌아가려면 0번을 입력합니다.
5. 장바구니를 확인하려면 4번, 모든 주문을 취소하려면 5번을 입력합니다.
6. 장바구니에서 주문하려면 1번, 더 담으려면 2번을 눌러 메인메뉴로 돌아갑니다.
7. 프로그램을 종료하려면 메인메뉴에서 0번을 입력합니다.

## 코드 실행 예시

![image](https://github.com/user-attachments/assets/b1b5f857-c5b9-48e9-ab29-9ff50d3c7006)
![image](https://github.com/user-attachments/assets/45348522-05e8-4042-af06-2432d1bde254)

## 개발 환경

- **Java JDK 17** ☕

## 블로그
