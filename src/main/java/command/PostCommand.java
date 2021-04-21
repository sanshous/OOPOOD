package command;

public class PostCommand implements Command {
    public String userId;

    public String text;

    public Object picture;

    public PostCommand(String userId, String text, Object picture) {
        this.userId = userId;
        this.text = text;
        this.picture = picture;
    }
}
