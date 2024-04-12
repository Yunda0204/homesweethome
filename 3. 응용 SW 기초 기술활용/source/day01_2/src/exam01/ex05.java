package exam01;

public class ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        num1 = 20;

        final int num2 = 30; //상수
//        num2 = 40; // 불가능

        final int num3;
        num3 = 30; // 최초 한 번만 대입 가능
//        num3 = 40; // 불가능

        System.out.println(num1);
        System.out.println(num2);



    }
}
