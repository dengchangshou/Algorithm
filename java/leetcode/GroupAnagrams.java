package algorithm.java.leetcode;

import java.util.*;

//49. 字母异位词分组
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            String tmp = String.valueOf(cArr);
            List<String> listTmp = map.get(tmp);
            if(listTmp == null) {
                listTmp = new ArrayList<>();
            }
            listTmp.add(s);
            map.put(tmp, listTmp);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
