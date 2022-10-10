package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueWords {

    public void count(ArrayList<String> words) {
        HashMap<String, Integer> uniqueWord = new HashMap<>();
        Integer i = 0;
        for (String wordItem : words) {
            if (uniqueWord.get(wordItem.toLowerCase()) != null) {
                i = uniqueWord.get(wordItem.toLowerCase()) + 1;
                uniqueWord.put(wordItem.toLowerCase(), i);
            } else
                uniqueWord.put(wordItem.toLowerCase(), 1);
        }
        printUniqueWords(uniqueWord);
        printCountUniqueWord(uniqueWord);
    }

    public void printUniqueWords(HashMap<String, Integer> printMap) {
        System.out.print("[");
        for (String item : printMap.keySet()) {
            System.out.print(item + " "); }
        System.out.print("] \n");
    }

    public void printCountUniqueWord(HashMap<String, Integer> mapForPrint) {
        for (String item : mapForPrint.keySet()) {
            System.out.println(item + " = " + mapForPrint.get(item));
        }
    }
}
