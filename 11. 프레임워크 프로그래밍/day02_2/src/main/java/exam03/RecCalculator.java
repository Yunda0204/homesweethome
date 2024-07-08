package exam03;

import exam02.Calculator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class RecCalculator implements Calculator {

    @Override
    public long factorial(long num) {
        if (num < 1L) {
            return 1L;
        }

        return num * factorial(num - 1L);
    }
}