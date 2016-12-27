package ru.t1mmy.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by t1mmy on 14.12.2016.
 */
public class SquareTests {
    @Test
    public void testSquare() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
