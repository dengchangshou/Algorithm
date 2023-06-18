package algorithm.java.leetcode;

import java.util.ArrayList;
import java.util.List;

//119. 杨辉三角 II
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.add(1);
                } else {
                    result.add(list.get(j - 1) + list.get(j));
                }
            }
            list = result;
        }
        return list;
    }

    //优化
    public List<Integer> getRow1(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            result.add(0);
            for (int j = i; j > 0; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
        return result;
    }
}
