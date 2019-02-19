package assignment.interfaces.impl;


import assignment.interfaces.IBird;
import org.junit.Assert;
import org.junit.Test;

public class ButterflyTest extends BaseTest {

    @Test
    public void testFly() {
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        Assert.assertEquals(outContent.toString(), "I am flying\n");
    }

}
