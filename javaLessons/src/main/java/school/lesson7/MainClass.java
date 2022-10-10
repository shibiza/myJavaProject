package school.lesson7;

public class MainClass {

    public static void main(String[] args){

        WorkWithFile file = new WorkWithFile();

        String fileNameFrom = "javaLessons/src/main/resources/FileToRead.csv";
        String fileNameIn = "javaLessons/src/main/resources/FileToWriteIn.csv";
        DataClass dataFromFile = new DataClass();
        DataClass dataInFile = new DataClass();

        // данные для записи в их в файл:
        String[] header = {"Header_1", "Header_2", "Header_3", "Header_4"};
        int[][] items = {{111, 222, 333, 444}, {555, 666, 777, 888}};
        dataInFile.setHeader(header);
        dataInFile.setData(items);

        //читаем из файла:
        file.readFile(fileNameFrom, dataFromFile);
        System.out.println("читаем из файла: " + dataFromFile.toString());

        //  запишем в файл:
        file.saveInFile(fileNameIn, dataInFile);
        dataInFile.toString();
    }
}
