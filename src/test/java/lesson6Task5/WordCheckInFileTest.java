package lesson6Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCheckInFileTest {

    @Test
    void shouldReturnTureForCheckWordInFile() {
        Assertions.assertTrue(WordCheckInFile.checkWordInFile("src\\main\\resources\\CheckWordInFile.txt", "reads"));
    }

    @Test
    void shouldReturnFalseForCheckWordInFile() {
        Assertions.assertFalse(WordCheckInFile.checkWordInFile("src\\main\\resources\\CheckWordInFile.txt", "cats"));
    }
}