package algorithm.java.leetcode;

//67. 二进制求和
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0, tmp = 0;
        for(int i = a.length() - 1, j = b.length() -1; i >= 0 || j >=0; i--, j--){
            int aa = 0, bb = 0;
            if(i >= 0) {
                aa = a.charAt(i) - '0';
            }
            if(j >= 0) {
                bb = b.charAt(j) - '0';
            }
            tmp = aa + bb + carry;
            if(tmp > 1){
                carry = 1;
                sum.insert(0, tmp - 2);
            }else {
                carry = 0;
                sum.insert(0, tmp);
            }
        }
        if(carry == 1){
            sum.insert(0, carry);
        }
        return sum.toString();
    }
}
