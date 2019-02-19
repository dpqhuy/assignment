package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class RoosterTest extends BaseTest {

    @Test
    public void testSay() {
        Rooster rooster = new Rooster();
        rooster.say();
        Assert.assertEquals(outContent.toString(), "Cock-a-doodle-doo\n");
    }

}
