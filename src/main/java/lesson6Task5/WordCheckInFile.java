package lesson6Task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCheckInFile {
    public static void main(String[] args) {
        checkWordInFile( "src\\main\\resources\\CheckWordInFile.txt");
    }
    public static void checkWordInFile(String filePath) {
        String checkWord = "reads";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean containsWord = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(checkWord)) {
                    containsWord = true;
                    break;
                }
            }
            if (containsWord) {
                System.out.println("The file contains the word:" + checkWord);
            } else {
                System.out.println("The file does not contain the word:" + checkWord);
            }
        } catch (IOException e) {
            System.out.println("problem with reading a file!!");
        }
    }
}
