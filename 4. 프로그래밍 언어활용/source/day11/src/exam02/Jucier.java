package exam02;

import java.util.ArrayList;

public class Jucier {
    public static void make(FruitBox<?> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);

    }
}
