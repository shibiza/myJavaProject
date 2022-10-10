package school.lesson8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        UniqueWords uniqueWords = new UniqueWords();
        BookOfPhoneNumbers phoneBook = new BookOfPhoneNumbers();

        //   Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
        //    уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается
        //    каждое слово.

        ArrayList<String> listOfUniqueWords = new ArrayList<>();
        listOfUniqueWords.add("ра-ра-ра");
        listOfUniqueWords.add("ра-ра-ра");
        listOfUniqueWords.add("на");
        listOfUniqueWords.add("дворе");
        listOfUniqueWords.add("у");
        listOfUniqueWords.add("нас");
        listOfUniqueWords.add("гора");
        listOfUniqueWords.add("ру-ру-ру");
        listOfUniqueWords.add("ру-ру-ру");
        listOfUniqueWords.add("собирайте");
        listOfUniqueWords.add("детвору");
        listOfUniqueWords.add("ры-ры-ры");
        listOfUniqueWords.add("ры-ры-ры");
        listOfUniqueWords.add("покатаемся");
        listOfUniqueWords.add("с");
        listOfUniqueWords.add("горы");
        listOfUniqueWords.add("ра-ра-ра");
        listOfUniqueWords.add("ра-ра-ра");
        listOfUniqueWords.add("очень");
        listOfUniqueWords.add("рада");
        listOfUniqueWords.add("детвора");

        uniqueWords.count(listOfUniqueWords);

        // Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
        //  искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
        //  (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

        phoneBook.add("Иванов", "+48 572 111111");
        phoneBook.add("Петров", "+48 572 222222");
        phoneBook.add("Сидоров", "+48 572 333333");
        phoneBook.add("Бородулька", "+48 572 444444");
        phoneBook.add("Бородулька", "+48 572 555555");
        phoneBook.add("Кошкин", "++48 572 666666");
        phoneBook.add("Собачкина", "+48 572 777777");
        phoneBook.add("Брошкина", "+48 572 888888");

        System.out.println();
        System.out.println("Иванов " + phoneBook.get("Иванов"));
        System.out.println("Бородулька " + phoneBook.get("Бородулька"));
        System.out.println("Брошкина  " + phoneBook.get("Брошкина"));
    }


}
