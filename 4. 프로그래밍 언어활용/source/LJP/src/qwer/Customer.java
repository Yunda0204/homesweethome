package qwer;

class Customer {
    private String name;
    private int price;

    // 생성자 정의
    public Customer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
