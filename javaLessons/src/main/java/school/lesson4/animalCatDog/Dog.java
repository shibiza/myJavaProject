package school.lesson4.animalCatDog;

public class Dog extends Animal {

static int dogCount=0;

    public Dog(String animalName) {
        super(animalName);
        dogCount++;
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
    public static void printDogCount() {
        System.out.println("Количество собак " + dogCount + ".");
    }

}
