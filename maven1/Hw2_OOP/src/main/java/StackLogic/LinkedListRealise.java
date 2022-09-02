package StackLogic;

import java.util.Collection;
import java.util.List;

public class LinkedListRealise<T> {

    static class Node<T> {
        T ValueObj;
        Node<T> NextValue;
        Node<T> PreviousValue;
        public Node(T value) {
            this.ValueObj = value;
            this.NextValue = null;
            this.PreviousValue = null;
        }
        public void display() {
            System.out.print(ValueObj + " ");
        }
    }
    int size = 0;
    private Node<T> firstElement;

    public void addFirst(T ValueObj) {
        Node<T> newFirst = new Node<T>(ValueObj);
        newFirst.NextValue = firstElement;
        firstElement = newFirst;
    }

    public T removeFirst() {
        Node<T> lastF = firstElement;
        firstElement = firstElement.NextValue;
        return lastF.ValueObj;
    }

    public void removeByIndex(T e) {
        Node<T> node = firstElement;
        Node<T> prevNode = null;
        while (node != null) {
            if (e.equals(node)) {
                if (prevNode == null) {
                    firstElement = node.NextValue;
                } else {
                    prevNode.NextValue = node.NextValue;
                }
                size--;
            } else {
                prevNode = node;
            }
            node = node.NextValue;
        }
    }

    public boolean isEmptyStack() {
        return firstElement == null;
    }

    public void displayList() {
        Node<T> tempDisplay = firstElement;
        while (tempDisplay != null) {
            tempDisplay.display();
            tempDisplay = tempDisplay.NextValue;
        }
        System.out.println();
    }
}
