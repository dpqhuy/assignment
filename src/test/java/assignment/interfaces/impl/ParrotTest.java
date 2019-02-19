package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class ParrotTest extends BaseTest {

    @Test
    public void testLiveWithDogSay() {
        Parrot parrot = new Parrot(new Dog());
        parrot.say();
        Assert.assertEquals(outContent.toString(), "Woof, woof\n");
    }

    @Test
    public void testLiveWithCatSay() {
        Parrot parrot = new Parrot(new Cat());
        parrot.say();
        Assert.assertEquals(outContent.toString(), "Meow\n");
    }

    @Test
    public void testLiveWithRoosterSay() {
        Parrot parrot = new Parrot(new Rooster());
        parrot.say();
        Assert.assertEquals(outContent.toString(), "Cock-a-doodle-doo\n");
    }

}
