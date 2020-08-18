package algorithm.java.hw;

import java.util.Scanner;

/*
计算一个数字的立方根，不使用库函数
详细描述：
接口说明
原型：
public static double getCubeRoot(double input)
输入:double 待求解参数
返回值:double  输入参数的立方根，保留一位小数
*/

//牛顿迭代法求立方根

public class GetCubeRoot {
    public static void getCubeRoot(){
        double input;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            input = sc.nextDouble();
            double x0 = input;
            double x1 = x0 - (x0 * x0 * x0 - input) / (3 * x0 * x0);
            while(x1 - x0 < -0.00001 || x1 - x0 > 0.00001){
                x0 = x1;
                x1 = x0 - (x0 * x0 * x0 - input) / (3 * x0 * x0);
            }
            System.out.println(String.format("%.1f", x1));
        }
    }
}
