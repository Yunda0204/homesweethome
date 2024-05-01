package exam04;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(3);
        System.out.println(names.capacity());
        names.add("임율1");
        names.add("임율2");
        names.add("임율3");
        names.add("임율4");
        names.add("임율5");
        names.add("임율6");
        names.add("임율7");
        System.out.println(names.capacity());
    }
}
