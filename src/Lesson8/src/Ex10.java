/**
 * Created by Игорь on 28.10.2016.
 * Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение
 */
public class Ex10 {
    public static void main(String[] args) {
        int n = 3;
        int n1=0;
        boolean exists=false;
        int[] x = {1,2,3,4,5};

        for(int i = 0;i<x.length;i++){
            if(x[i]==n){
                n1=i;
                exists=true;
            }
        }if (exists) {
            System.out.println("Индекс числа "+n+" в массиве = "+n1);
        } else {
            System.out.println("Такого числа нет");
        }
    }
}
