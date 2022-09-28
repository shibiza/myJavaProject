package school.lesson5;

public class Box<T extends Fruit> {

    private T obj;
    private int fruitCount;

    public Box(T obj, int fruitCount) {
        this.obj = obj;
        this.fruitCount = fruitCount;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void addFruit(int a) {
        fruitCount += a;
    }

    float getWeight() {
        return fruitCount * obj.getWeight();
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }
}