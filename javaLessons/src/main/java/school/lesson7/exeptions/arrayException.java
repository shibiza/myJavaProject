package school.lesson7.exeptions;

public class arrayException extends NumberFormatException {
    public arrayException() {
        super();
    }

    public void getMessage(int i, int j) {
        System.out.format("item [%d][%d] не является числом. %n", i, j);
    }
}
