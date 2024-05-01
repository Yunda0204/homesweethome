package exam01;

public class Outer {

    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public Calculator method(int num3) {
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                //num3 = 100; 지역변수의 상수화로 인해 변경 불가능 final int num3...
                return num1 + num2 + num3;
               }
        };
    }
}
