package org.example;


import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitQuickcheck.class)
public class ClosestEvenErrorTest {

    private final App app = new App();

    //    @Property
    public void resultShouldBeEven(int number) {

        var res = app.getClosestEvenError(number);

        assertEquals(0, res % 2);
    }

    @Property
    public void resultShouldBeTheSameForEven(int number) {

        var num = number * 2;

        var res = app.getClosestEvenError(num);

        assertEquals(res, num);
    }

    //    @Property
    public void resultShouldBeLessForOdd(int number) {

        var num = number * 2 + 1;

        var res = app.getClosestEvenError(num);

        assertTrue(res < num);
    }
}
