package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000,"윤다은","Java");
        s1.study(); // 함수가 실행 되려면 우선 객체가 먼저 생성되어야 한다.

        Student s2 = new Student(1001,"도선화","React");
        s2.study();

//        System.out.println(System.identityHashCode(s1));

    }
}
