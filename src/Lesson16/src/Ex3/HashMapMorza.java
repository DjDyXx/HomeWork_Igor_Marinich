package Ex3;

import java.util.HashMap;

/**
 * Created by Игорь on 27.11.2016.
 */
public class HashMapMorza {
    public static void main(String[] args) {
        String word = "KRISTINA";
        getMorza(word);
    }

    public static void getMorza(String word) {

        HashMap<String, String> morze = new HashMap();
        morze.put("A", ".-");
        morze.put("B", "-...");
        morze.put("C", "-.-.");
        morze.put("D", "-..");
        morze.put("E", ".");
        morze.put("F", "..-.");
        morze.put("G", "--.");
        morze.put("H", "....");
        morze.put("I", "..");
        morze.put("J", ".---");
        morze.put("K", "-.-");
        morze.put("L", ".-..");
        morze.put("M", "--");
        morze.put("N", "-.");
        morze.put("O", "---");
        morze.put("P", ".--.");
        morze.put("Q", "--.-");
        morze.put("R", ".-.");
        morze.put("S", "...");
        morze.put("T", "-");
        morze.put("U", "..-");
        morze.put("V", "...-");
        morze.put("W", ".--");
        morze.put("X", "-..-");
        morze.put("Y", "-.--");
        morze.put("Z", "--..");
        morze.put("0", ".-----");
        morze.put("1", ".----");
        morze.put("2", "..---");
        morze.put("3", "...--");
        morze.put("4", "....-");
        morze.put("5", ".....");
        morze.put("6", "-....");
        morze.put("7", "--...");
        morze.put("8", "---..");
        morze.put("9", "----.");

        for (int letter = 0; letter < word.length(); letter++) {
            char letterChar = word.charAt(letter);
            String letterString = String.valueOf(letterChar);
            String value = morze.get(letterString);
            System.out.print(" "+value);
        }
    }
}
