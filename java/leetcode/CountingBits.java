package algorithm.java.leetcode;

//338. 比特位计数
public class CountingBits {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for(int i = 0; i <= n; i++){
            int j = i;
            while (j > 0){
                j &= (j - 1);
                bits[i]++;
            }
        }
        return bits;
    }
}
