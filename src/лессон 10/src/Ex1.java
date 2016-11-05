/**
 * Created by Notebook on 05.11.2016
 * Задайте целочисленный одномерный массив и отсортируйте его элементы в порядке убывания
 * Например:
 * входные данные: {23, 12, 43, 41, 85}
 * результат: {85, 43, 41, 23, 12}
 */
public class Ex1 {
    public static void main(String[] args) {

        int[] array = {23, 12, 43, 51, 85};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
        OutputArray.output(array);
    }
}
