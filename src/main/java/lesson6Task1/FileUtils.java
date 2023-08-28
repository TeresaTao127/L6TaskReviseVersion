package lesson6Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    public static void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Path.of(pathToFile), text);
        } catch (IOException exception) {
            System.out.println("problem with saving a file!! " + exception.getMessage());
        }
    }
}
