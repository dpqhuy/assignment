package assignment.interfaces.impl;

import assignment.interfaces.ICanWalk;

public class Caterpillar implements ICanWalk {
    private int state = 0; // 0: catterpillar, 1: butterfly

    @Override
    public void walk() {
        if (state == 0) {
            System.out.println("I am crawling");
        } else {
            System.out.println("I am transformed");
        }
    }

    public Butterfly transform() {
        state = 1;
        return new Butterfly();
    }
}
