package command;

public class LikeCommand implements Command {
    public String userIdOn;

    public String userIdFrom;

    public Boolean like;

    public LikeCommand(String userIdOn, String userIdFrom, Boolean like) {
        this.userIdOn = userIdOn;
        this.userIdFrom = userIdFrom;
        this.like = like;
    }
}
