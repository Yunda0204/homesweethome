package exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
        List<String> names = new LinkedList<>();
        names.add("윤다은");
        names.add("류다혜");
        names.add("최은정");
        names.add("박수아");
        names.add("이지은");

//        for (int i = 0; i < names.size(); i++) {
//            names.remove(i);
//        }

        for (int i = names.size() - 1; i >= 0; i--) {
            names.remove(i);
        }

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
        System.out.println(name);
        }

        System.out.println(names); // names.toString(); -> 담긴 값을 확인할 수 있도록 재정의
    }
}
