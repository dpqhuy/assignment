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

    @Test
    public void testSayDanish() {
        Rooster rooster = new Rooster();
        rooster.sayByLanguage("da");
        Assert.assertEquals(outContent.toString(), "kykyliky\n");
    }

    @Test
    public void testSayDutch() {
        Rooster rooster = new Rooster();
        rooster.sayByLanguage("nl");
        Assert.assertEquals(outContent.toString(), "kukeleku\n");
    }

}
