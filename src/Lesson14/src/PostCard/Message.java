package PostCard;

/**
 * Created by Игорь on 18.11.2016.
 */
public class Message {
    private String theme;
    private String contain;
    private String from;
    private String to;

    public Message(String newTheme, String newContain, String newFrom, String newTo) {
        theme = newTheme;
        contain = newContain;
        from = newFrom;
        to = newTo;
    }
}
