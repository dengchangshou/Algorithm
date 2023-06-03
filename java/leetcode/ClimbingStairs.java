package algorithm.java.leetcode;

//70. 爬楼梯
public class ClimbingStairs {

    //动态规划算法
    public int climbStairs(int n) {
        //a表示爬到n-2阶的爬法，b表示爬到n-1阶的爬法
        //到第n阶的爬法 = 到第n-1的爬法 + 到第n-2的爬法
        //因为第n阶只能从n-1或者n-2爬上来
        int a = 0, b = 0, temp = 1;
        for(int i = 1; i <= n; i++){
            b = a;
            a = temp;
            temp = a + b;
        }
        return temp;
    }
}
