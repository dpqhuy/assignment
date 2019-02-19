package assignment.interfaces.impl;

import assignment.interfaces.ISay;

public class Parrot extends Bird {
    private ISay sayObject;

    public Parrot(final ISay nearEntity) {
        this.sayObject = nearEntity;
    }

    @Override
    public void say() {
        if (sayObject != null) {
            sayObject.say();
        }
    }
}
