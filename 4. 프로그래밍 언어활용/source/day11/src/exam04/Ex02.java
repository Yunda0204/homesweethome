package exam04;

import java.util.ArrayList;
import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("최아린");
        names.push("도선화");
        names.push("임율");
        names.push("유채정");
        names.push("김아영");

        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }
}
