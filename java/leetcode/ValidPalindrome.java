package algorithm.java.leetcode;

//125. 验证回文串
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left <= right){
            if(isDigitalOrLetter(s.charAt(left)) && isDigitalOrLetter(s.charAt(right))){
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }else {
                if (!isDigitalOrLetter(s.charAt(left))) {
                    left++;
                }
                if (!isDigitalOrLetter(s.charAt(right))) {
                    right--;
                }
            }
        }
        return true;
    }

    private boolean isDigitalOrLetter(char c){
        return ('0' <= c && '9' >= c) || ('a' <= c && 'z' >= c);
    }
}
