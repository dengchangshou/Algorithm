package algorithm.java.leetcode;

//258. 各位相加
public class AddDigits {
    public int addDigits(int num) {
        int sum;
        while (num > 9){
            sum = num;
            num = 0;
            while (sum > 0){
                num += sum % 10;
                sum /= 10;
            }
        }
        return num;
    }
}
