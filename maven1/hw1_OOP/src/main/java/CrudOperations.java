import java.util.List;

public interface CrudOperations<T> {
    public void DeleteList(List<T> list);
    public void AddToList(T t);
}

