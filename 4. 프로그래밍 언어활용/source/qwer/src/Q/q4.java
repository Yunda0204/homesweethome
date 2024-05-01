package Q;

public class q4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                if (k >= i) {
                    System.out.println(i + " * " + k + " = " + (i * k));
                }
            }
        }
    }
}

