package algorithm.java.leetcode;

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//IV            4
//IX            9
//XL            40
//XC            90
//CD            400
//CM            900

import java.util.HashMap;
import java.util.Map;

//13.罗马数字转整数
public class RomanToInt {
    //自解
    public int romanToInt(String s) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>(){
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
                put("IV", 4);
                put("IX", 9);
                put("XL", 40);
                put("XC", 90);
                put("CD", 400);
                put("CM", 900);
            }
        };
        int result = 0;
        String s1 = "";
        while (s.length() > 0) {
            if(s.length() > 1) {
                s1 = s.substring(0, 2);
            }else {
                s1 = s.substring(0, 1);
            }
            if (hashMap.containsKey(s1)) {
                result += hashMap.get(s1);
            } else {
                s1 = s.substring(0, 1);
                result += hashMap.get(s1);
            }
            s = s.substring(s1.length());
        }
        return result;
    }

    //答案1
    public int romanToInt1(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1; i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    //答案2
    public int romanToInt2(String s) {
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");

        int result = 0;
        for (int i=0; i<s.length(); i++) {
            result += getValue1(s.charAt(i));
        }
        return result;
    }

    private int getValue1(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'a':
                return 4;
            case 'b':
                return 9;
            case 'c':
                return 40;
            case 'd':
                return 90;
            case 'e':
                return 400;
            case 'f':
                return 900;
            default:
                return 0;
        }
    }
}
