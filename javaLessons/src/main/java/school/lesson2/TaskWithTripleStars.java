package school.lesson2;

public class TaskWithTripleStars {
/*
*** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
    нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
*/
    public static void shiftArrayElementsNSteps(int arr[], int n) {

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = a;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int a = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = a;
            }
        }
    }
}





