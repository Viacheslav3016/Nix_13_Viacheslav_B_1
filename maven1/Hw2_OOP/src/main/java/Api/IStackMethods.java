package Api;

public interface IStackMethods<T> {
    void push(T t);
     T pop();
     String print();
     boolean isEmptyStack();
}
