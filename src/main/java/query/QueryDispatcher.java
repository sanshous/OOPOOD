package query;

public interface QueryDispatcher<TResult> {
    TResult execute(Query query);
}
