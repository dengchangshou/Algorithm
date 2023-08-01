package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//3. 无重复字符的最长子串
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, max = 0;
        int len = arr.length;
        while(end < len){
            char c = arr[end];
            if(map.containsKey(c) && map.get(c) >= start){
                start = map.get(c) + 1;
            }
            map.put(c, end);
            end++;
            if(end - start > max){
                max = end - start;
            }
        }
        return max;
    }
}
