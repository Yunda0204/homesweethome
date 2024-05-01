package exam03;

public class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("어흥");
    }

    public void hunting() {
        System.out.println("사냥을 한다.");
    }
/*
    @Override
    public void move() {
        super.move();
    }*/
}
