package school.lesson2;

public class TasksFrom5To8 {

    public static void homeTasksWithArrays() {

        // 5.
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        //  6.
        int[] arr2 = new int[100];
        int n = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = n;
            n++;
        }

        //  7.
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }

        //  8.
        int[][] arr4 = new int[9][9];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, x = arr4[i].length - 1; j < arr4[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
        }
    }
}

