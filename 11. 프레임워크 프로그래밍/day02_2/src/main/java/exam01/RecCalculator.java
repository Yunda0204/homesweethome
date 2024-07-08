package exam01;

public class RecCalculator implements Calculator{

    long result = 1L;

    @Override
    public long factorial(long num) {
        if (num < 1L) {
            return 1L;
        }
        return num * factorial(num - 1L);
    }

}
