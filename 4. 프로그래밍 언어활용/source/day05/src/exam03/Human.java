package exam03;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립 보행을 한다");

    }

    public void reading() {
        System.out.println("독서를 한다.");
    }
}
