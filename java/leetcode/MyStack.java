package algorithm.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//225. 用队列实现栈
public class MyStack {

    Queue<Integer> a;
    Queue<Integer> b;

    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.offer(x);
        while (b.size() != 0){
            a.offer(b.poll());
        }
        b = a;
        a = new LinkedList<>();
    }

    public int pop() {
        return b.poll();
    }

    public int top() {
        return b.peek();
    }

    public boolean empty() {
        return b.isEmpty();
    }
}
