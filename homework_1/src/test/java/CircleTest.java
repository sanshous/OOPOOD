import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void get_square() {
        Circle c = new Circle(2.5);
        double actual = c.get_square();
        double expected = 19.625;
        Assert.assertEquals(expected, actual, 0.01);
    }
}