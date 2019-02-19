package assignment.interfaces.impl;


import assignment.interfaces.IFish;
import org.junit.Assert;
import org.junit.Test;

public class SharkTest extends BaseTest {

    @Test
    public void testConstructor() {
        Shark shark = new Shark();
        Assert.assertEquals(shark.getSize(), "large");
        Assert.assertEquals(shark.getColor(), "grey");
        Assert.assertEquals(shark.getDetail(), "eat other fish");
    }

}
