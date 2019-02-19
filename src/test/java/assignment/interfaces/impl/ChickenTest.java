package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class ChickenTest extends BaseTest {

    @Test
    public void testSay() {
        Chicken chicken = new Chicken();
        chicken.say();
        Assert.assertEquals(outContent.toString(), "Cluck, cluck\n");
    }

}
