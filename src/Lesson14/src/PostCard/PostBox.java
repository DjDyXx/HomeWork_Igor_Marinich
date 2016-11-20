package PostCard;

/**
 * Created by Игорь on 18.11.2016.
 * Создайте класс "Почтовый ящик", который может принимать и отправлять письма.
 * В классе "Письмо" создайте поля "тема письма", "содержание письма", "от кого",
 * "кому". Можете придумать и другие поля по желанию
 */
public class PostBox {
    private Message[] messages;
    private int count;

    public PostBox() {
        count = 0;
        messages = new Message[8];
    }

    public void getMessage(Message message) {
        messages[count] = message;
        count++;
    }

    public void messageOut(Message message) {
        count--;
        Adresses clients = new Adresses();
        clients.clientMessageGet(count,message);
        messages[count] = null;

    }
}
