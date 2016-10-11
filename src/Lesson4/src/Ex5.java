/**
 * Created by Игорь on 09.10.2016.
 * Телевизор будет работать если напряжение в сети равно 220 В или 230 В. Проверьте его работоспособность в зависимости от поданного напряжения

 */
public class Ex5 {
    public static void main(String[] args) {
        String switch1 = "220V";
        String switch2 = "230V";

        if(switch1.equals("220V")||switch2.equals("230V")){
            System.out.println("Телевизор ВКЛ");
        }else {
            System.out.println("Телевизор ВЫКЛ");
        }
    }
}
