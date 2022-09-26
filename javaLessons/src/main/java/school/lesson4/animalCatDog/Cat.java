package school.lesson4.animalCatDog;

public class Cat extends Animal {

    static int catCount=0;
    public Cat(String animalName) {
        super(animalName);
        catCount++;
    }

    @Override
    public void run(int runLength) {
        if ((runLength >= 0) && (runLength <= 200)) {
            System.out.println(animalName + " пробежал " + runLength + " м.");
        } else System.out.println(animalName + " столько не пробежит.");
    }

    @Override
    public void swim(int swimLength) {
        System.out.println(animalName + " не умеет плавать.");
    }

    public static void printCatCount() {
        System.out.println("Количество котов " + catCount + ".");
    }
}
