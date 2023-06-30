package algorithm.java.leetcode;

import java.util.HashSet;
import java.util.Set;

//202. 快乐数
public class HappyNumber {
    //哈希法
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    //快慢指针法
    public boolean isHappy1(int n) {
        int low = n;
        int fast = getNext(n);
        while(fast != 1 && fast != low){
            low = getNext(low);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    private int getNext(int n) {
        int sum = 0, tmp;
        while(n > 0){
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}
