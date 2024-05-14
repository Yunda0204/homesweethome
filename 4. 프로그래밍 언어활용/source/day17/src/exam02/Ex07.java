package exam02;

import java.time.LocalTime;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) {
        LocalTime today = LocalTime.now();
        LocalTime time = LocalTime.of(10,22,33);
        System.out.println(time);
        System.out.println(today);
    }
}
