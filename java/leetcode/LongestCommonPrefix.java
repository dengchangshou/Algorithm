package algorithm.java.leetcode;
//14. 最长公共前缀
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        for(int i = 0; i < s1.length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(i > strs[j].length() - 1 || s1.charAt(i) != strs[j].charAt(i)){
                    return s1.substring(0, i);
                }
            }
        }
        return s1;
    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0) return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length() == 0) return "";
                //公共前缀不匹配就让它变短！
                s = s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
