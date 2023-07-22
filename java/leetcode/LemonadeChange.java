package algorithm.java.leetcode;

import java.util.HashMap;
import java.util.Map;

//860. 柠檬水找零
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        for(int i = 0; i < bills.length; i++){
            int per = bills[i];
            switch (per){
                case 5:
                    map.put(5, map.get(5)+1);
                    break;
                case 10:
                    if(map.get(5) > 0){
                        map.put(5, map.get(5)-1);
                        map.put(10, map.get(10)+1);
                    }else {
                        return false;
                    }
                case 20:
                    if(map.get(10) > 0 && map.get(5) > 0){
                        map.put(10, map.get(10)-1);
                        map.put(5, map.get(5)-1);
                    }else if(map.get(5) >= 3){
                        map.put(5, map.get(5)-3);
                    }else {
                        return false;
                    }
            }
        }
        return true;
    }
}
