package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class AnimalTest extends BaseTest {

    @Test
    public void testWalk() {
        Animal animal = new Animal();
        animal.walk();
        Assert.assertEquals(outContent.toString(), "I am walking\n");
    }

    @Test
    public void testSing() {
        Animal animal = new Animal();
        animal.sing();
        Assert.assertEquals(outContent.toString(), "I am singing\n");
    }

}
