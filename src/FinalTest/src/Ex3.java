/**
 * Created by Игорь on 27.11.2016.
 * Найти сумму десяти первых чисел ряда Фиббоначи
 Числа Фибоначчи: 1 1 2 3 5 8 13 ... (первое число 1, второе 1, следующие равны сумме 2х предыдущих)
 */
public class Ex3 {
    public static void main(String[] args) {
        int [] fibonachi = new int[10];
        int sum = 0 ;
        for (int i = 0;i<fibonachi.length;i++){
            if(i == 0){
                fibonachi[i] =  i+1;
                sum = sum + fibonachi[i];
            }
            if(i == 1){
                fibonachi[i] =  i;
                sum = sum + fibonachi[i];
            }
            if(i>1){
                fibonachi[i] = (fibonachi[i-1]+fibonachi[i-2]);
                sum = sum + fibonachi[i];
            }
        }
        System.out.println(sum);
        arrayOutput(fibonachi);
    }

    private static void arrayOutput(int [] array) {
        System.out.println("Вот массив : ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
