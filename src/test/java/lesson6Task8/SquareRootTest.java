package lesson6Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    void shouldTestSquareRoot() {
        SquareRoot squareRoot=new SquareRoot(49);
        double expectedResult=7;
        double result=SquareRoot.getSquareRoot(49);
        Assertions.assertEquals(expectedResult,result);

    }
}