package school.lesson7.exeptions;

import school.lesson7.DataClass;

public class Methods {

    //запишем данный из файла в консоль или класс:
    public void fromFileToClass(String strToData, DataClass data) {
        String[] arrayWithData = strToData.split(":");
        data.setHeader(arrayWithData[0].split(";"));

        int i = 1;
        int n = data.getHeader().length;
        int[][] dataItem = new int[arrayWithData.length - 1][n];

        while (i <= arrayWithData.length - 1) {
            String[] newStrWithData = arrayWithData[i].split(";");
            if (newStrWithData.length != n)
                System.out.println("Ошибка импорта данных из файла: количество заголовков не соответствует количеству строк в  " + i + " строке");
            for (int j = 0; j < (Math.min(n, newStrWithData.length)); j++) {
                dataItem[i - 1][j] = isNumber(newStrWithData[j], i - 1, j) ? Integer.parseInt(newStrWithData[j]) : 0;
            }
            i++;
        }
        data.setData(dataItem);
    }

    //если массив не 4х4, бросить исключение:
    public boolean isNumber(String item, int i, int j) {
        try {
            Integer.parseInt(item);
            return true;
        } catch (NumberFormatException e) {
            new arrayException().getMessage(i, j);
            return false;
        }
    }
}
