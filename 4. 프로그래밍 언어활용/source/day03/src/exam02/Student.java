package exam02;

public class Student {
    public static int id;
    private String name;
    private String subject;

    public Student(){

    }

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static void stticMethod() {
        System.out.println("정적 메서드");

    }
    public void instanceMethod() {
        System.out.println("인스탄스 메서드");

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
