package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//383. 赎金信
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) - 1);
            }else {
                return false;
            }
        }
        return true;
    }
}
