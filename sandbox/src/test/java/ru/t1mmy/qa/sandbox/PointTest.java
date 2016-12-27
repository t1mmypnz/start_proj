package ru.t1mmy.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by t1mmy on 28.12.2016.
 */
public class PointTest {
    @Test
    public void testPoit() {
        Point p1 = new Point(5,0);
        Point p2 = new Point(7,0);
        Assert.assertEquals(p2.distance(p1), 2.0);
    }

}
