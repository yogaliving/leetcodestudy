package practice.stack_queue;
/**
 * 232 两个栈实现队列  注意 一个栈只管进，一个栈只管出
 */

import java.util.Stack;

public class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (outStack.isEmpty())
            in2out();
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (outStack.isEmpty())
            in2out();
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (outStack.isEmpty())
            in2out();
        return outStack.isEmpty();
    }
    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
