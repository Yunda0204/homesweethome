package exam03;

public class Ex01 {
    public static void main(String[] args) {
//        SimpleCalculator cal = new SimpleCalculator(); 가능, 범용성 ㅎㅌㅊ
        Calculator cal = new SimpleCalculator(); // 가능, 범용성 GOAT
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
