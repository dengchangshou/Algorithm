package algorithm.java.niukewang;

import java.util.Stack;

/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*/

//用两个栈实现队列
public class StackImplementationQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //入队
    public void push(int node){
        stack1.push(node);
    }

    //出队
    public int pop(){
        if(stack2.empty()) {
            while (!stack1.empty()) {
                int bottom = stack1.pop();
                stack2.push(bottom);
            }
        }
        return stack2.pop();
    }
}
