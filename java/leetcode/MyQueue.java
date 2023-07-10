package algorithm.java.leetcode;

import java.util.Stack;

//232. 用栈实现队列
public class MyQueue {

    Stack<Integer> stackA = null;
    Stack<Integer> stackB = null;

    public MyQueue() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        while (!stackB.empty()){
            stackA.push(stackB.pop());
        }
        stackA.push(x);
        while (!stackA.empty()){
            stackB.push(stackA.pop());
        }
    }

    public int pop() {
        return stackB.pop();
    }

    public int peek() {
        return stackB.peek();
    }

    public boolean empty() {
        return stackB.size() == 0;
    }
}
