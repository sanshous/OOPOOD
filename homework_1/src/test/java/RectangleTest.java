import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void get_square() {
        Rectangle r = new Rectangle(3.2, 2.6);
        double actual = r.get_square();
        double expected = 8.32;
        Assert.assertEquals(expected, actual, 0.01);
    }
}