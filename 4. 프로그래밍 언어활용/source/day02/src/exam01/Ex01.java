package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "윤다은";
        s1.subject = "Java";
        System.out.println(s1.id);
        s1.study();


        Student s2 = new Student();
        s2.id = 1000;
        s2.name = "도선화";
        s2.subject = "JavaScript";
        s2.study();

        System.out.println(s1 == s2);

        Student s3 = s2;

        s3.name = "류다혜";
        s3.study();
        s2.study();
        System.out.println(s2 == s3);

//        s1 = null;
//        s1.name = "이진표";
    }
}
