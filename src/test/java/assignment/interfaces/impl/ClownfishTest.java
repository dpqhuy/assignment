package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class ClownfishTest extends BaseTest {

    @Test
    public void testConstructor() {
        Clownfish clownfish = new Clownfish();
        Assert.assertEquals(clownfish.getSize(), "small");
        Assert.assertEquals(clownfish.getColor(), "colorful");
        Assert.assertEquals(clownfish.getDetail(), "make jokes");
    }

}
