package algorithm.java.leetcode;

//66. 加一
public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 10){
                return digits;
            }else{
                digits[i] = 0;
                if(i != 0){
                    digits[i-1] += 1;
                }else {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result;
                }
            }
        }
        return digits;
    }
}
