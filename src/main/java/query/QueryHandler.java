package query;

public interface QueryHandler<TResult>{
    TResult execute(Query query);
}
