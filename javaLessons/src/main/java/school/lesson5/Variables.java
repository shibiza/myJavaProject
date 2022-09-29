package school.lesson5;

public class Variables {

    static String[] words = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};

    protected static final Apple apple1 = new Apple();
    protected static final Apple apple2 = new Apple();
    protected static final Apple apple3 = new Apple();

    protected static final Orange orange1 = new Orange();
    private static final Orange orange2 = new Orange();

    protected static final Box<Apple> appleBox1 = new Box<>(apple1, apple2, apple3);
    protected static final Box<Orange> orangeBox2 = new Box<>(orange1, orange2);
    protected static final Box<Orange> orangeBox3 = new Box<>();
}
