package query;

public class CommentQuery implements Query {
    public String userIdOn;

    public String comment;

    public String userIdFrom;

    public CommentQuery(String userIdOn, String comment, String userIdFrom) {
        this.userIdOn = userIdOn;
        this.comment = comment;
        this.userIdFrom = userIdFrom;
    }
}
