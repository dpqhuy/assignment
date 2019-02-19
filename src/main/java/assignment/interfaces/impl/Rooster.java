package assignment.interfaces.impl;

import assignment.languages.LangConfig;

public class Rooster extends Chicken {
    @Override
    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void sayByLanguage(final String lang) {
        String sound = LangConfig.getSound(Rooster.class.getSimpleName(), lang);
        System.out.println(sound == null ? "Cock-a-doodle-doo" : sound);
    }
}
