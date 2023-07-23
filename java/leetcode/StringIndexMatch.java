package algorithm.java.leetcode;

//28. 找出字符串中第一个匹配项的下标
public class StringIndexMatch {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        for(int i = 0; i < len1 - len2 + 1; i++){
            int tmp = i;
            int j = -1;
            for(j = 0; j < len2; j++){
                if(tmp < len1 && haystack.charAt(tmp) == needle.charAt(j)){
                    tmp++;
                }else {
                    break;
                }
            }
            if(j == needle.length()){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
