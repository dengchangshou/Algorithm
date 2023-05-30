package algorithm.java.leetcode;

//58. 最后一个单词的长度
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maxLen = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                maxLen++;
            }else if(maxLen > 0){
                return maxLen;
            }
        }
        return maxLen;
    }
}
