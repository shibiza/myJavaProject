package school.lesson7;

import java.util.Arrays;

public class DataClass {
    private String[] header;
    private int[][] data;

    public DataClass() {
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        checkCountOfData(data);
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    private void checkCountOfData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].length != header.length) {
                System.out.println("Ошибка в классе DataClass: количество значений не равно количеству заголовков в " + i + " строке");
            }
        }
    }

    @Override
    public String toString() {
        return "DataClass {" +
                "заголовок=" + Arrays.toString(header) +
                ", значение=" + Arrays.deepToString(data) + '}';
    }

    public String headerToString() {
        StringBuilder headerString = new StringBuilder();
        Arrays.stream(this.header).forEach(h -> headerString.append(h).append(";"));
        headerString.setLength(headerString.length() - 1);
        return headerString.toString();
    }

    public String dataToString() {
        StringBuilder dataString = new StringBuilder();

        for (int[] datum : this.data) {
            Arrays.stream(datum).forEach(d -> dataString.append(d).append(";"));
            dataString.setLength(dataString.length() - 1);
            dataString.append("\n");
        }
        return dataString.toString();
    }
}
