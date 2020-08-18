package algorithm.java.hw;

import java.util.Scanner;

/*
正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
*/
//最小公倍数
public class LeastCommonMultiple {
    public static void leastCommonMultiple(){
        int A, B, result;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int length = s1.length;
            int[] nums = new int[length];
            for (int i = 0; i < length; i++) {
                nums[i] = Integer.parseInt(s1[i]);
            }
            A = nums[0];
            B = nums[1];
            result = 1;
            for (int j = 1; j <= A || j <= B; j++) {
                if (A % j == 0 && B % j == 0) {
                    result *= j;
                    A /= j;
                    B /= j;
                }
            }
            result = result * A * B;
            System.out.println(result);
        }
    }

}
