package school.lesson6;

public class Main {

    private static int isArrayFourByFour(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int countArrayElements = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    countArrayElements = countArrayElements + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return countArrayElements;
    }

    public static void main(String[] args) {
        String[][] array = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                int result = isArrayFourByFour(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует 4х4");
            }
        } catch (
                MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке " + e.i + "x" + e.j);
        }
    }
}
