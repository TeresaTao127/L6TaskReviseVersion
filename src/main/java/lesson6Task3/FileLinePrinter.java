package lesson6Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLinePrinter {
    public static void main(String[] args) {
        printEverySecondLine("src\\main\\resources\\EverySecondLine.txt");
    }

    public static void printEverySecondLine(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber % 2 == 0) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("problem with reading a file!! ");
        }
    }
}