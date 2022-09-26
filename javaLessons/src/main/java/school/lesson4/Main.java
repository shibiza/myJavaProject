package school.lesson4;

import school.lesson4.animalCatDog.Animal;
import school.lesson4.animalCatDog.Cat;
import school.lesson4.animalCatDog.Dog;
import school.lesson4.paymentAndPark.Park;
import school.lesson4.paymentAndPark.Payment;

public class Main {

    public static void main(String[] args) {

        // распечатаем классы Park и Payment
        System.out.println("\nИнформация по классу Payment с продуктами:");
        Payment.paymentPrintProducts();
        System.out.println("\nИнформация по классу Park с аттракционами:");
        Park.parkPrintRides();

        // Далее создадим объекты классов Dog и Cat (которые наследовались от Animal) и выведем на печать:
        System.out.println("\nИнформация по классу Animal с животными Dog и Cat:");
        Dog dog1 = new Dog("Бобик");
        dog1.run(359);
        dog1.swim(8);

        Cat cat1 = new Cat("Барсик");
        cat1.run(201);
        cat1.swim(2);

        Cat cat2 = new Cat("Пушок");
        cat2.run(158);
        cat2.swim(0);

        Animal.printAnimalsCount();
        Dog.printDogCount();
        Cat.printCatCount();
    }
}
