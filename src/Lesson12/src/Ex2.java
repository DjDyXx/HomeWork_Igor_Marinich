/**
 * Created by Игорь on 10.11.2016.
 * Напишите 2 функции шифровки и дешифровки кода Цезаря. В коде Цезаря каждый символ заменяется другим, сдвинутым по алфавиту на число N.
 * Алфавит введите в переменной:
 * String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
 * Регистр букв неважен, всегда приводите всё к заглавным буквам (здесь можно использовать функцию toUpperCase для строки).
 */
public class Ex2 {
    public final static int N = 2;
    public static void main(String[] args) {
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String word = "Кристина";
        System.out.println("Изначальное слово : " + word);
        String wordUpperCase = word.toUpperCase();

        String encr = encryption(wordUpperCase,alphabet);
        String deencr = decryption(encr,alphabet);

        System.out.println("Шифрованый код слова " + word + " : " + encr);
        System.out.println("Дешифрованый код слова " + deencr + " : " + deencr);
    }


    private static String encryption(String word, String alphabet) {
        String result = "";
        String [] wordArray = stringToArray(word);
        String [] alphabetArray = stringToArray(alphabet);

        for(int charachter = 0;charachter<=wordArray.length-1;charachter++){
            for(int letter = 0;letter<=alphabetArray.length-1;letter++){
                if(wordArray[charachter].equals(alphabetArray[letter])){
                    result = result + (wordArray[charachter] = alphabetArray[letter+N]);
                    break;
                }
            }
        }
        return result;
    }

    private static String decryption(String encr,String alphabet) {
        String result = "";
        String [] wordArray = stringToArray(encr);
        String [] alphabetArray = stringToArray(alphabet);

        for(int charachter = 0;charachter<=wordArray.length-1;charachter++){
            for(int letter = 0;letter<=alphabetArray.length-1;letter++){
                if(wordArray[charachter].equals(alphabetArray[letter])){
                    result = result + (wordArray[charachter] = alphabetArray[letter-N]);
                    break;
                }
            }
        }
        return result;
    }

    private static String[] stringToArray(String symbols) {
        String [] array = symbols.split("");
        return array;
    }

}