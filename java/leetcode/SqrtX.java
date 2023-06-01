package algorithm.java.leetcode;

//69. x 的平方根
public class SqrtX {
    //暴力破解法（二分法）
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int i = 1;
        while(i <= x / i){
            i++;
        }
        return i - 1;
    }

    //牛顿迭代法
    public int mySqrt1(int x){
        if(x == 0){
            return 0;
        }
        double C = x, x0 = x;
        while(true){
            double xi = 0.5 * (x0 + C / x0);
            if(Math.abs(x0 - xi) < 1e-7){
                break;
            }
            x0 = xi;
        }
        return (int) x0;
    }
}
