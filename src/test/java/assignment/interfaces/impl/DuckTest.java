package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class DuckTest extends BaseTest {

    @Test
    public void testSay() {
        Duck duck = new Duck();
        duck.say();
        Assert.assertEquals(outContent.toString(), "Quack, quack\n");
    }

    @Test
    public void testSwim() {
        Duck duck = new Duck();
        duck.swim();
        Assert.assertEquals(outContent.toString(), "I am swimming\n");
    }

}
