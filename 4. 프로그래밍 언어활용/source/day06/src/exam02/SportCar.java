package exam02;

public class SportCar extends Car{

    @Override
    public void start() {
        System.out.println("부릉콰앙");
    }

    @Override
    public void press() {
        System.out.println("AK셀레이터 밝고");
    }

    @Override
    public void turnoff() {
        System.out.println("시동 끄기");
    }
}
