package school.lesson7;

import school.lesson7.exeptions.Methods;

import java.io.*;

public class WorkWithFile {

    public boolean readFile(String pathToFile, DataClass data) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            Methods help = new Methods();
            String str;
            StringBuilder finalStr = new StringBuilder();

            while ((str = reader.readLine()) != null) {
                finalStr.append(str).append(":");
            }
            help.fromFileToClass(String.valueOf(finalStr), data);
            reader.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveInFile(String pathToFile, DataClass data) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile))) {
            StringBuilder strForWrite = new StringBuilder();

            strForWrite.append(data.headerToString())
                    .append("\n")
                    .append(data.dataToString());
            writer.write(strForWrite.toString());
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
