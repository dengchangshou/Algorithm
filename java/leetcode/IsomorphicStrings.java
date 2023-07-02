package algorithm.java.leetcode;

import java.util.HashMap;

//205. 同构字符串
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> t1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if((s1.containsKey(s.charAt(i)) && s1.get(s.charAt(i)) != t.charAt(i))
             || (t1.containsKey(t.charAt(i)) && t1.get(t.charAt(i)) != s.charAt(i))){
                return false;
            }
            s1.put(s.charAt(i), t.charAt(i));
            t1.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
