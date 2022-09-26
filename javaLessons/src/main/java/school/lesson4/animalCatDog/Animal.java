package school.lesson4.animalCatDog;

public class Animal {

    String animalName;
    static int count;

    public Animal(String animalName) {
        this.animalName = animalName;
        count++;
    }

    public void run(int runLength) {
    }

    public void swim(int swimLength) {
    }

    public static void printAnimalsCount() {
        System.out.println("Количество животных " + count + ".");
    }

}



