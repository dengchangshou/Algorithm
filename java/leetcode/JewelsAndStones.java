package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//771. 宝石与石头
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < jewels.length(); i++){
            map.put(jewels.charAt(i), 1);
        }
        for(int i = 0; i < stones.length(); i++){
            if(map.containsKey(stones.charAt(i))){
                ans++;
            }
        }
        return ans;
    }
}
