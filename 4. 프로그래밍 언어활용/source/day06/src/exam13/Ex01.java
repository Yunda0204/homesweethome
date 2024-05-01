package exam13;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method(30);
        int result = cal.add(10, 20);
        int result2 = cal.add(75,624);
        System.out.println(result);
        System.out.println(result2);

    }
}
