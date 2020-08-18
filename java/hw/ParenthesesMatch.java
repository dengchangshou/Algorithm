package algorithm.java.hw;

import java.util.Stack;

//括号匹配
public class ParenthesesMatch {
    public static boolean ParenthesesMatch(String s){
        Stack<Character> queue = new Stack<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            queue.push(s.charAt(i));
            int j = i + 1;
            if ((queue.peek() == '(' && s.charAt(j) == ')') || (queue.peek() == '[' && s.charAt(j) == ']') || (queue.peek() == '{' && s.charAt(j) == '}')) {
                queue.pop();
                i = j;
            }
        }
        if(queue.empty()) return true;
        return false;
    }
}
