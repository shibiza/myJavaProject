package school.lesson4.catsAndPlates;

public class CatsAndPlates {
    /*
  Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
●         Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
●        Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
●        Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
●        Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

    public static void main(String[] args) {

        CatEat[] cat = new CatEat[5];
        cat[0] = new CatEat("Барсик", 90);
        cat[1] = new CatEat("Беляш", 160);
        cat[2] = new CatEat("Мурзик", 60);
        cat[3] = new CatEat("Лысый", 70);
        cat[4] = new CatEat("Пушок", 50);

        Plate plate = new Plate(600);

        System.out.println("Сейчас в миске " + plate.getFood() + " кусочков еды.\n");

        for (CatEat i : cat) {
            if (i.getSatiety() == 0) {
                if (!plate.checkFood(i.getAppetite())) {
                    plate.increaseFood();
                }
                i.eat(plate);
                System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " кусков ");
            }

            i.setSatiety(i.getSatiety() - 1);
        }
        System.out.println("В миске осталось " + plate.getFood() + " кусков.\n");
    }

    public static class Plate {

        private int food;

        int getFood() {
            return food;
        }

        Plate(int food) {
            this.food = food;
        }

        void decreaseFood(int n) {
            food -= n;
        }

        void increaseFood() {
            this.food += 300;
            System.out.println("В миску добавили 300 кусочков еды");
        }

        boolean checkFood(int n) {
            return (food - n) >= 0;
        }
    }

    public static class CatEat {

        private final String name;
        private final int appetite;
        private int satiety;

        String getName() {
            return name;
        }

        int getAppetite() {
            return appetite;
        }

        int getSatiety() {
            return satiety;
        }

        void setSatiety(int satiety) {
            this.satiety = satiety;
        }

        CatEat(String name, int appetite) {

            this.name = name;
            this.appetite = appetite;
            this.satiety = 0;
        }

        void eat(Plate p) {
            p.decreaseFood(appetite);
            satiety += satiety;
        }
    }
}
