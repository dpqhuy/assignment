package assignment.interfaces.impl;

import assignment.interfaces.IFish;

public class Fish implements IFish {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
