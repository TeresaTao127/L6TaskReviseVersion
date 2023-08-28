package lesson6Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsReadFromFileTest {

    @Test
    void readFromFile() {
        String filePath = "src\\main\\resources\\DataReader.txt";
        String content = FileUtilsReadFromFile.readFromFile(filePath);
        String expectedTextFromFile="Operations on files are often referred to as input/output (I/O) operations.";

        Assertions.assertEquals(expectedTextFromFile,content);
    }
}