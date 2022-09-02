package StackLogic;

import Api.IStackMethods;
import Api.IStackProMethods;

import java.util.LinkedList;
import java.util.List;


public class Stack<T> extends LinkedList<T> implements IStackMethods<T>, IStackProMethods<T> {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Stack.class.getSimpleName());
    private final LinkedListRealise<T> stackList = new LinkedListRealise<>();

    @Override
    public void push(T ValueObj) {
        stackList.addFirst(ValueObj);
        logger.info("element was added");
   }

    @Override
    public void pushSet(List<T> list) {
        for (T i : list) {
            stackList.addFirst(i);
        }
        logger.info("Set of elements was added");

    }



    @Override
    public String toString() {
        return "StackLogic.Stack{" +
                "StackList=" + stackList +
                '}';
    }

    @Override
    public T pop() {
        logger.info("Element was deleted");
        return stackList.removeFirst();
    }

    @Override
    public String print() {
        stackList.displayList();
        logger.info("printing Stack of elements");
        return "";
    }

    @Override
    public boolean isEmptyStack() {
        return stackList.isEmptyStack();
    }

    @Override
    public void  popIndex(T index) {
        stackList.removeByIndex(index);
        logger.info("Element by index: "+ index + " was deleted");
    }
}


