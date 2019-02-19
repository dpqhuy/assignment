package assignment.interfaces.impl;


import assignment.interfaces.IFish;
import org.junit.Assert;
import org.junit.Test;

public class DolphinTest extends BaseTest {

    @Test
    public void testSwim() {
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        Assert.assertEquals(outContent.toString(), "I am swimming\n");
    }

}
