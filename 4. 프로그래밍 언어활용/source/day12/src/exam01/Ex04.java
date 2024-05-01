package exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
//        HashSet<String> names = new HashSet<>();
        Set<String> names = new TreeSet<>();
        names.add("윤다은");
        names.add("류다혜");
        names.add("류다혜");
        names.add("도선화");
        names.add("채도아");
        names.add("최아린");
        System.out.println(names); //names.toString()
    }
}
