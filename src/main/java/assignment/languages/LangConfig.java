package assignment.languages;

import assignment.interfaces.ISay;

import java.util.HashMap;
import java.util.Map;

public class LangConfig {
    private static final Map<String, Map<String, String>> langMap = new HashMap<>();

    static {
        Map<String, String> roosterMap = new HashMap<>();
        roosterMap.put("da", "kykyliky");
        roosterMap.put("nl", "kukeleku");

        langMap.put("Rooster", roosterMap);
    }

    public static String getSound(final String animal, final String lang) {
        if (langMap.get(animal).containsKey(lang)) {
            return langMap.get(animal).get(lang);
        }
        return null;
    }
}
