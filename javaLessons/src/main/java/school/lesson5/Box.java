package school.lesson5;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private T obj;
    private int fruitCount;
    ArrayList<T> box = new ArrayList<>();

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

    public void addFruit(T obj, int a) {
        box.add(obj);
        fruitCount += a;
    }

    float getWeight() {
        return fruitCount * obj.getWeight();
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public int replaceFruitsToAnotherBox(Box<T> box2) {
        box2.addAll(box);
        this.box.clear();
        return (int) box2.getWeight();
    }

    private void addAll(ArrayList<T> box) {
    }
}