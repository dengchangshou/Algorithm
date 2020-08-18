package algorithm.java.niukewang;

/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target == 0 ||target == 1) return 1;
        int[] list = new int[target+1];
        list[0] = list[1] = 1;
        for(int i = 2; i <= target; i++){
            for(int j = 0; j < i; j++)
                list[i] += list[j];
        }
        return list[target];
    }

    public int JumpFloor2(int target) {
        if(target == 0 ||target == 1) return 1;
        int result = 1;
        for(int i = 2; i <= target; i++){
            result *= 2;
        }
        return result;
    }
}
