package command;

public class CommentCommand implements Command {
    public String userIdOn;

    public String userIdFrom;

    public String comment;

    public CommentCommand(String userIdOn, String userIdFrom, String comment) {
        this.userIdOn = userIdOn;
        this.userIdFrom = userIdFrom;
        this.comment = comment;
    }
}
