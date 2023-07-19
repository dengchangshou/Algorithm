package algorithm;

import java.util.Arrays;
import java.util.List;

//290. 单词规律
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        List<String> list = Arrays.asList(s.split(" "));
        if(pattern.length() != list.size()){
            return false;
        }
        for(int i = 0; i < list.size(); i++){
            char c = pattern.charAt(i);
            String s1 = list.get(i);
            for(int j = i + 1; j < list.size(); j++){
                if((c == pattern.charAt(j) && !s1.equals(list.get(j)))
                 || (c != pattern.charAt(j) && s1.equals(list.get(j)))){
                    return false;
                }
            }
        }
        return true;
    }
}
