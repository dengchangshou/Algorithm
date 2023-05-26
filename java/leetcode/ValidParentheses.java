package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Stack;

// 20. 有效的括号
public class ValidParentheses {

    //常规解法：栈
    public boolean isValid1(String s) {
        if(s.length() == 0 || s.length() % 2 != 0){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>(){
            {
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }
        };
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.empty() || map.get(stack.peek()) == null || map.get(stack.peek()) != s.charAt(i)){
                stack.push(s.charAt(i));
            }else {
                stack.pop();
            }
        }
        return stack.empty();
    }

    //技巧：替换法
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0){
            return false;
        }
        for (int i = 0; i < len / 2; i++){
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
        if(s.length() > 0){
            return false;
        }
        return true;
    }
}
