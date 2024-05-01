package exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
//    HashSet<Book> books = new HashSet<>();
        Set<Book> books = new TreeSet<>();
        books.add(new Book(1000, "데일 카네기의 인간관계론", "데일 카네기"));
        books.add(new Book(1001, "논어", "공자"));
        books.add(new Book(1001, "논어", "공자"));
        books.add(new Book(1002, "냉정한 이타주의", "모름"));
        books.add(new Book(1003, "다이어트 절대 하지마라", "모름"));
        books.add(new Book(1004, "돈의 속성", "스노우 폭스 회장님"));

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
