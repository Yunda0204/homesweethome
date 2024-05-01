package exam01;
// T는 Fruit의 하위클래스
public class Box<T extends Fruit & Eatable> { // <T> : 지네릭 클래스, T - 타입 매개변수, BOX : 원시타입
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String toString() {
        item.get();
        return null;
    }

}
