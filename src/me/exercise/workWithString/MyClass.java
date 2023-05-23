package me.exercise.workWithString;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyClass {

    public int numOfString (String string, String s){
        // конструкция не дает вылететь изза null и корректно отображает количество вхождений подстроки в строку даже если она последняя
        return ((string + "\0").split(s).length - 1);
    }

    public String censor(String string, String cens){
        return string.replace(cens, "[вырезано цензурой]");
    }

    public String longestString(String[] strings) {
        int a = 0;
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > a) {
                a = strings[i].length();
                str = strings[i];
            }
        }
        return str;
    }

    public String reversString(String s) {
        char[] array = s.toCharArray();
        char[] reversArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversArray[reversArray.length - i - 1] = array[i];
        }
        return String.valueOf(reversArray);
    }

    public boolean isAPolyndrom(String s) {
        String string = s.replace(" ", "");
        if (string.equalsIgnoreCase(reversString(string))) {
            return true;
        }
        return false;
    }

    public void buildDictionary(String text) {
        text = text.toLowerCase();

        int[] result = new int['я' - 'а' + 1];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                result[ch - 'а']++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }
    }

    public void buildDictionaryWithMap(String text) {
        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // ё идёт отдельно от а-я
            if ((ch >= 'а' && ch <= 'я') || ch == 'ё') {
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //Работает начиная с Java11
    public static String fileToString(String path) throws IOException {
        return Files.readString(Paths.get(path), StandardCharsets.UTF_8);
    }
}
