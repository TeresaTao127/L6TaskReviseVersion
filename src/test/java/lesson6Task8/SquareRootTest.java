package lesson6Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    void shouldTestSquareRoot() {
        double expectedResult=7;
        double result=SquareRoot.getSquareRoot(49);
        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    void shouldTestExceptionThrow() {
        double number = -1;
        assertThrows(IllegalArgumentException.class, () -> SquareRoot.getSquareRoot(number));
    }
}