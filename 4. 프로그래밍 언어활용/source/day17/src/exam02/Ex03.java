package exam02;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();

        Locale locale = new Locale("Ko","Kr");
        String yoilstr = month.getDisplayName(TextStyle.FULL, locale);
        System.out.println(yoilstr);

        String yoilStrEng = month.getDisplayName(TextStyle.FULL, locale.ENGLISH);
        System.out.println(yoilStrEng);
    }
}
