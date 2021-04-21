package query;

public class PostQuery implements Query{
    public String post;

    public String userId;

    public PostQuery(String post, String userId) {
        this.post = post;
        this.userId = userId;
    }
}
