package pl.jaczewski.m12_collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        // pary "klucz"-"definicja"
        languages.put("Java", "a language I'm learning now");
        languages.put("Python", "high-level programming language");
        languages.put("BASIC", "beginners symbolic instruction code");
        languages.put("HTML", "not a programming language!");

        System.out.println(languages.get("Python"));

        languages.put("Python", "the value above will be overwritten");
        System.out.println(languages.get("Python"));

        // sprawdzanie, czy dany klucz (który jest unikalny!) został już wcześniej użyty:
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a language I'm learning now, making progress");
        }

        // keySet - używany, aby wyświetlić wszystkie pary klucz-definicja
        // lista jest nieuporządkowana!
        System.out.println("======");
        for (String key: languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
