package exam01;

public class Ex01 {
    public static void main(String[] args) {
//        Calculator cal = new SimpleCalculator(); 가능
//        SimpleCalculator cal = new SimpleCalculator();  가능
//        SimpleCalculator cal = new ComplexCalculator(); 불가능
        Calculator cal = new ComplexCalculator(); // 가능
        int result = cal.add(10, 20);
        System.out.println(result);
        System.out.println(cal.num);


        ComplexCalculator cal2 = new ComplexCalculator();
        int result2 = cal2.add(33,63);
        System.out.println(result2);
    }
}
