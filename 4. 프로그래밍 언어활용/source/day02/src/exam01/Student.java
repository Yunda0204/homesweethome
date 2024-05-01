package exam01;

public class Student {
    int id; // 학번
    String name; // 이름
    String subject; // 과목

    public Student(){
        id = 1000;
        name = "dldlfma";
        subject = "wkqk";
    }

public Student(int _id, String _name, String _subject) {
    id = _id;
    name = _name;
    subject = _subject;
// 실행 시점? id, name, subject에 공간을 할당 받은 상태
//    System.out.println("객체 생성 이후 실행");
// 인스턴스 변수의 초기화 작업을 주로 수행
}

    void study() {
        System.out.printf("학번은:%d, %s가 %s를 공부한다.", id, name, subject);

    }
}
