package algorithm.java.leetcode;

import java.util.Arrays;

//回文数
public class PalindromeNumber {
    //转换为字符串
    public boolean isPalindrome(int x) {
        char[] s = String.valueOf(x).toCharArray();
        int len = s.length;
        for(int i = 0, j = len - 1; i < len / 2; i++, j--){
            if(s[i] != s[j]){
                return false;
            }
        }
        return true;
    }

    //不转换为字符串
    public boolean isPalindrome1(int x) {
        if(x < 0) {
            return false;
        }
        int a = 0, b = x;
        while(b/10 > 0) {
            a = a*10 + b % 10;
            b /= 10;
        }
        a = a * 10 + b;
        if(a == x) {
            return true;
        }
        return false;
    }

    //高效率
    public boolean isPalindrome3(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }
        int b = 0;
        while(x > b){
            b = b * 10 + x % 10;
            x /= 10;
            if(x == b || (x < b && x == b/10)){
                return true;
            }
        }
        return false;
    }
}
