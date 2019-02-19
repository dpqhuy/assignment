package assignment.interfaces.impl;


import assignment.interfaces.IFish;
import org.junit.Assert;
import org.junit.Test;

public class FishTest extends BaseTest {

    @Test
    public void testSwim() {
        IFish Fish = new Fish();
        Fish.swim();
        Assert.assertEquals(outContent.toString(), "I am swimming\n");
    }

}
