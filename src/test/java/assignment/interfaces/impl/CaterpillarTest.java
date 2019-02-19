package assignment.interfaces.impl;


import org.junit.Assert;
import org.junit.Test;

public class CaterpillarTest extends BaseTest {

    @Test
    public void testWalk() {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.walk();
        Assert.assertEquals(outContent.toString(), "I am crawling\n");
    }

    @Test
    public void testTransform() {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.transform();
        caterpillar.walk();
        Assert.assertEquals(outContent.toString(), "I am transformed\n");
    }

}
