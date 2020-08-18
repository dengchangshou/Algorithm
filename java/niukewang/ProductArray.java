package algorithm.java.niukewang;

/*
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
*/

//构建乘积数组
public class ProductArray {
    public int[] multiply(int[] A){
        int len = A.length;
        int[] B = new int[len];
        for(int i = 0; i < len; i++){
            B[i] = 1;
            for(int j = 0; j < len; j++){
                if(i == j) continue;
                B[i] *= A[j];
            }
        }
        return B;
    }

    //优化
    public int[] multiply1(int[] A){
        int len = A.length;
        int[] B = new int[len];
        int res = 1;
        for(int i = 0; i < len; i++){
            B[i] = res;
            res *= A[i];
        }
        res = 1;
        for(int i = len - 1; i >= 0; i--){
            B[i] *= res;
            res *= A[i];
        }
        return B;
    }
}
