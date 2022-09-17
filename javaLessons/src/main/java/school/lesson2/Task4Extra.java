package school.lesson2;

public class Task4Extra {

    public static boolean isYearLeap(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return false;
        } else {
            return true;
        }
    }
}
