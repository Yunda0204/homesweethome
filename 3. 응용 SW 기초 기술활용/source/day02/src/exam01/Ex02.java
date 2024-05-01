package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result = num1++ > 10 && (num1 = num1 + 10) > 15;
        boolean result1 = ++num2 > 10 && (num2 = num2 + 10) > 15;
        boolean result2 = !result1;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(result2);
    }
}
