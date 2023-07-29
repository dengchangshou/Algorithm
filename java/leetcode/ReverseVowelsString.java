package algorithm.java.leetcode;

//345. 反转字符串中的元音字母
public class ReverseVowelsString {
    public String reverseVowels(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        char c1, c2;
        for(int i = 0, j = s.length() - 1; i <= j;){
            c1 = s.charAt(i);
            c2 = s.charAt(j);
            if(i == j){
                stringBuffer.insert(i, c1);
                break;
            }else {
                if(isVowel(c1) && isVowel(c2)){
                    stringBuffer.insert(i, c2);
                    i++;
                    stringBuffer.insert(i, c1);
                    j--;
                }else if(isVowel(c1)){
                    stringBuffer.insert(i, c2);
                    j--;
                }else if(isVowel(c2)){
                    stringBuffer.insert(i, c1);
                    i++;
                }else {
                    stringBuffer.insert(i, c1);
                    i++;
                    stringBuffer.insert(i, c2);
                    j--;
                }
            }
        }
        return stringBuffer.toString();
    }

    private boolean isVowel(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
