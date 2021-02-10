import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void get_square() {
        Square s = new Square(3.2);
        double actual = s.get_square();
        double expected = 10.24;
        Assert.assertEquals(expected, actual, 0.01);
    }
}