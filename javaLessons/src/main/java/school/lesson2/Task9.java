package school.lesson2;

public class Task9 {

    public static int[] returnArrayWithInitialValue(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
