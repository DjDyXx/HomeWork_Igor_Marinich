/**
 * Created by Игорь on 08.11.2016.
 * Напишите функцию перевода строки в ее эквивалент азбуки Морзе
 * Например:
 * String "abc"; результат: ".--...-.-."
 * Таблицу представить в виде двумерного массива (1 строка это буквы, 2 строка - код морзе)
 * Например:
 * String[] arr = {{"A", ".-"}, {"B", "-..."}, ..., {"Z", "--.."}}
 */
public class Ex3 {
    public static void main(String[] args) {
        String[][] morza = getMorza();
        String word = "KRISTINA";
        String traslation = foundSymbolMorza(morza, word);
    }


    private static String foundSymbolMorza(String[][] morza, String word) {
        for (int letter = 0; letter < word.length(); letter++) {
            char letterChar = word.charAt(letter);
            String letterString = String.valueOf(letterChar);
            for (int arraySymbol = 0; arraySymbol < morza.length; arraySymbol++) {
                if(letterString.equals(morza[arraySymbol][0])){
                    System.out.print(morza[arraySymbol][1]+ " ");
                }
            }
        }
        return "0";
    }


    private static String[][] getMorza() {
        String[][] morza = {{"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."},
                {"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."},
                {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."},
                {"O", "---"}, {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."},
                {"T", "-"}, {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"},
                {"Y", "-.--"}, {"Z", "--.."}, {"0", ".-----"}, {"1", ".----"}, {"2", "..---"},
                {"3", "...--"}, {"4", "....-"}, {"5", "....."}, {"6", "-...."}, {"7", "--..."}, {"8", "---.."}, {"9", "----."}};
        return morza;
    }
}
