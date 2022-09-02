package Start;

import StackLogic.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.isEmptyStack();
        stack.push("abc");
        stack.push("cba");
        System.out.println(stack.print());
        stack.isEmptyStack();
    }
}
