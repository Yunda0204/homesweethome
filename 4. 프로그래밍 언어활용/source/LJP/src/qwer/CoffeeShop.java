package qwer;

public class CoffeeShop {
    public static void main(String[] args) {
        // 초기화 한 생성자를 통해 객체(인스턴스 생성)
        Customer 윤다은 = new Customer("아메리카노", 4000);
        Customer 채도아 = new Customer("카페라떼", 4500);

        System.out.println("윤다은이 " + 윤다은.getName() + "를 " + 윤다은.getPrice() + "원 주고 샀다");
        System.out.println("채도아가 " + 채도아.getName() + "를 " + 채도아.getPrice() + "원 주고 샀다");
    }
}