package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        // 변경 불가 List, 추가 수정 삭제 불가능
        List<String> names = Arrays.asList("채도아", "윤다은", "도선화");
//        names.remove(0);
//        names.clear();
        System.out.println(names);

// 변경이 필요한 경우는 List의 구현 클래스의 객체 생성시 생성자 매개변수로 대입
        List<String> names2 = new ArrayList<>(names);

/*      삭제 가능
        names2.remove(2);
        names2.clear();
        삭제 가능            */

        names2 = Arrays.asList("이진표", "김준성", "박준상");

        System.out.println(names2);

    }
}
