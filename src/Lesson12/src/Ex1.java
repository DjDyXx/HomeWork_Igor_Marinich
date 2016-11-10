/**
 * Created by Игорь on 10.11.2016.
 * Из текста, в котором записаны слова через пробел, каждое слово заменить на такое же,
 * оставив только первую и последнюю буквы, середину заменить на число, которое равно количеству удаленных букв.
 * Слова, в которых меньше 5 букв заменять не нужно.
 * Например,
 * Ввод: "localization internationalization duplication red cat"
 * Вывод: "l10n i18n d9n red cat"
 */
public class Ex1 {
    public static void main(String[] args) {
        String str = "localization internationalization duplication red cat";
        changeTheString(str);

    }


    private static void changeTheString(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 5 ) {
                int cnt = words[i].length() - 2;
                String centerOfWord = words[i].substring(1, words[i].length() - 1);
                String changed = words[i].replace(centerOfWord, String.valueOf(cnt));
                System.out.print(changed+" ");
            }else{
                System.out.print(words[i]+ " ");
            }
        }
    }
}