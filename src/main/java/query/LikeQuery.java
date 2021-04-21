package query;

public class LikeQuery implements Query{
    public boolean like;
    public String userIdOn;
    public String userIdFrom;
    public LikeQuery(boolean like, String userIdOn, String userIdFrom) {
        this.like = like;
        this.userIdOn = userIdOn;
        this.userIdFrom = userIdFrom;
    }
}
