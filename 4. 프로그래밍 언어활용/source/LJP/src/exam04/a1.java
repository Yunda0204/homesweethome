package exam04;

public class a1 {
    public static void main(String[] args) {
        int 줄 = 4;
        for (int i = 0; i < 줄; i++) {
            for (int j = 0; j < 줄 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

