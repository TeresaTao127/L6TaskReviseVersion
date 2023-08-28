package lesson6Task1;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @org.junit.jupiter.api.Test
    void writeToFile() {
        String content = "Course\n" +
                "Java\n" +
                "Lesson 6\n" +
                "Files\n" +
                "Exceptions\n" +
                "Files\n" +
                "End of file";

        FileUtils.writeToFile("src\\main\\resources\\Data.txt", content);

        FileUtils.writeToFile("src\\main\\resources\\writeFile_copy.txt", "problem with saving a file!!");

    }
}