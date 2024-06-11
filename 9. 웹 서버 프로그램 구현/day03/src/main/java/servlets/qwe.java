package servlets;

public class qwe {
    public static void main(String[] args) {
        Student asd1 = new Student();
        Student asd2 = new Student();
        System.out.println(asd1.stnum);
        System.out.println(asd2.stnum);
        System.out.println(asd1.hashCode());
        System.out.println(asd2.hashCode());
        System.out.println(Student.num == asd1.stnum);
        System.out.println(Student.num == asd2.stnum);
        System.out.println(Student.num);

    }
}
