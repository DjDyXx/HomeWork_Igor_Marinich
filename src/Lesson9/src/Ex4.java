/**
 * Created by Игорь on 03.11.2016.
 * Исправьте ошибку в задаче метода деления пополам, которую мы делали в классе,
 * проверьте правильность работы для случаев, когда в массиве:
 * - четное количество элементов
 * - нечетное количество элементов
 * - существует число, которое необходимо найти
 * - числа не существует в массиве
 */
public class Ex4 {
    public static void main(String[] args) {

        int[] array = {2, 5, 6, 9, 12, 15, 18, 35};

        int n = 7;

        int fromIndex = 0;
        int toIndex = array.length - 1;

        boolean exists = false;

        while (fromIndex <= toIndex) {

            int midIndex = (toIndex + fromIndex) / 2;

            if (array[midIndex] == n) {
                exists = true;
                break;
            }

            if (array[midIndex] >= n) {
                toIndex = midIndex-1;
            } else {
                fromIndex = midIndex+1;
            }
        }

        if (exists) {
            System.out.println("Элемент существует");
        } else {
            System.out.println("Элемент не существует");
        }
    }
}

