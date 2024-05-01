package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.setItem(new Apple());

        Apple apple = appleBox.getItem();
        System.out.println(apple.get());

        Box<Grape> grapeBox = new Box<Grape>();
        grapeBox.setItem(new Grape());

        Grape grape = grapeBox.getItem();
        System.out.println(grape.get());
    }
}
