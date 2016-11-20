package PostCard;

/**
 * Created by Игорь on 18.11.2016.
 */
public class PostOffice {
    public static void main(String[] args) {
        PostBox box1 = new PostBox();
        Message mes1 = new Message("Lesson", "Hello,i'm your strudent,want to tel about lesson.", "Igor", "Stas");
        Message mes2 = new Message("Reserve", "I want to reserve table.", "Igor", "Admin");

        box1.getMessage(mes1);
        box1.getMessage(mes2);

        box1.messageOut(mes1);
        box1.messageOut(mes2);

    }
}
