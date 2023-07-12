package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//242. 有效的字母异位词
public class ValidAnagram {
    //哈希暴力法
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char sn = s.charAt(i);
            char tn = t.charAt(i);
            if(mapS.containsKey(sn)){
                mapS.put(sn, mapS.get(sn) + 1);
            }else {
                mapS.put(sn, 1);
            }
            if(mapT.containsKey(tn)){
                mapT.put(tn, mapT.get(tn) + 1);
            }else {
                mapT.put(tn, 1);
            }
        }
        if(mapS.size() != mapT.size()){
            return false;
        }
        for(Map.Entry<Character, Integer> map : mapS.entrySet()){
            if(!mapT.containsKey(map.getKey()) || !mapT.get(map.getKey()).equals(map.getValue())){
                return false;
            }
        }
        return true;
    }

}
