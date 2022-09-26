package school.lesson4.animalCatDog;

public class Dog extends Animal {

    public Dog(String animalName) {

        super(animalName);
    }

    @Override
    public void run(int runLength) {
        if ((runLength >= 0) && (runLength <= 500)) {
            System.out.println(animalName + " пробежал " + runLength + " м.");
        } else System.out.println(animalName + " столько не пробежит.");
    }

    @Override
    public void swim(int swimLength) {
        if ((swimLength >= 0) && (swimLength <= 10)) {
            System.out.println(animalName + " проплыл " + swimLength + " м.");
        } else System.out.println(animalName + " столько не проплывет.");
    }
}
