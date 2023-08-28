package lesson6Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsReadFromFileTest {

    @Test
    void readFromFile() {
        String filePath = "src\\main\\resources\\DataReader.txt";
        String content = FileUtilsReadFromFile.readFromFile(filePath);
        System.out.println("Content of a file: \n" + content);
    }
}