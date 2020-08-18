package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class model {
    public static void input(String[] args){
        //输入一行数字
        Scanner sc = new Scanner(System.in);
        System.out.println("读取一行数字：");
        String oneLine = sc.nextLine();
        String[] cs = oneLine.split(" ");
        for (String x : cs) {
            int intValue = Integer.valueOf(x);
            System.out.print(intValue + " ");
        }


        //输入n行数字，行数确定
        System.out.println("读取n行数字：");
        int lines = 3;
        String[] multiLines = new String[3];
        int i = 0;
        while (i < lines) {
            multiLines[i++] = sc.nextLine();
        }
        for (String s : multiLines) {
            System.out.println(s);
        }


        //输入多行数字，未知行数
        System.out.println("输入多行数字：");
        List<String> list = new ArrayList<>();
        String input = "";
        while (true) {
            input = sc.nextLine();
            if (!input.equals("q")) {
                list.add(input);
            }else {
                break;
            }
        }
        for (String s : list) {
            //只能转换一行一个数字，多个数字需要额外同上的操作
            //int intValue = Integer.valueOf(s);
            System.out.println(s);
        }

        //读入一个字符串
        String s=sc.next();

        //读入一个浮点数
        double t = sc.nextDouble();

        //读入一行
        String s1 = sc.nextLine();
        //判断是否有下一个输入sc.hasNext()或sc.hasNextInt()或sc.hasNextDouble()或sc.hasNextLine()

        //读入一行空格隔开的数据
        String s2 = sc.nextLine();
        String ss[] = s2.split(" ");
        int len = ss.length;
        int[] src = new int[len];
        for(i = 0; i < len; i++){
            src[i] = Integer.parseInt(ss[i]);
        }
    }

    //连续输入多个数
    public static void readManyNumber(){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = in.nextInt();
        }
    }

    //读入整数
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){  //判断是否结束
            //int score = sc.nextInt();
        }//读入整数
    }

    //读入字符串
    //输入数据有多行，第一行是一个整数n，表示测试实例的个数，后面跟着n行，每行包括一个由字母和数字组成的字符串。
    //Sample Input
    // 2
    //asdfasdf123123asdfasdf
    //asdf111111111asdfasdfasdf
    public static void a(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
        }
    }
}
