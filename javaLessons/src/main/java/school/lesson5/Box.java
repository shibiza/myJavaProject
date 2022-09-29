package school.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    protected final ArrayList<T> fruits;

    protected Box(T... items) {
        this.fruits = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.fruits.addAll(Arrays.asList(items));
    }

    public void remove(T... items) {
        for (T item : items) this.fruits.remove(item);
    }

    public ArrayList<T> getFruits() {
        return new ArrayList<T>(fruits);
    }

    public void clear() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0) return 0;
        float weight = 0;
        for (T item : fruits) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void replaceFruitsToAnotherBox(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }
}
