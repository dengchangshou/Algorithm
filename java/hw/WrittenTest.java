package algorithm.java.hw;

import java.util.Scanner;

import static java.lang.Math.abs;

public class WrittenTest {
    public static void WrittenTest(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] s = new int[n][2];
            int times = n / m + 1;
            System.out.println(times);
        }




//        while(sc.hasNextInt()){
//            int m = sc.nextInt();
//            int n = sc.nextInt();
//            int[][] z = new int[m][n];
//            int[] count = new int[501];
//            for(int i = 0; i < m; i++){
//                for(int j = 0; j < n; j++){
//                    z[i][j] = sc.nextInt();
//                    count[z[i][j]]++;
//                }
//            }
//
//            int max = 0;
//            for(int i = 1; i < 501; i++){
//                if(count[i] >= max) {
//                    max = count[i];
//                }
//            }
//
//            int[] number = new int[500];
//            int a = 0;
//            for(int i = 1; i < 501; i++){
//                if(count[i] == max) {
//                    number[a] = i;
//                    a++;
//                }
//            }
//
//            if(max == 0){
//                System.out.println(0);
//            }else if(max == 1) {
//                System.out.println(1);
//            }else {
//                int sum = 0;
//                for(int k = 0; number[k] != 0; k++) {
//                    int x1 = 501, x2 = 0, y1 = 501, y2 = 0;
//                    for (int i = 0; i < m; i++) {
//                        for (int j = 0; j < n; j++) {
//                            if (z[i][j] == number[k]) {
//                                if (i < y1) y1 = i;
//                                else if (i > y2) y2 = i;
//                                if (j < x1) x1 = j;
//                                else if (j > x2) x2 = j;
//                            }
//                        }
//                    }
//                    int s = (abs(x2 - x1) + 1) * (abs(y2 - y1) + 1);
//                    if(s > sum)
//                        sum = s;
//                }
//                System.out.println(sum);
//            }
//
//
//
//
//
//        }
//        while(sc.hasNextDouble()){
//            double k = sc.nextDouble();
//            double n = sc.nextDouble();
//            double m = sc.nextDouble();
//            int a = (int)n;
//            int b = (int)m;
//            if(k == 0) {
//                System.out.println(0);
//            }
//            double x = k - k / 10 * 10 - k % 10;
//            int y = (int)(k - x);
//            int count = 0;
//            while(y / b != 0){
//                int c = y % b;
//                if(c == a)
//                    count++;
//                k /= b;
//            }
//            if(k == a)
//                count++;
//            System.out.println(count);
//
//        }

    }
}
