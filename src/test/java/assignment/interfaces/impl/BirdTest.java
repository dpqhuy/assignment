package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class BirdTest extends BaseTest {

    @Test
    public void testFly() {
        Bird bird = new Bird();
        bird.fly();
        Assert.assertEquals(outContent.toString(), "I am flying\n");
    }

}
