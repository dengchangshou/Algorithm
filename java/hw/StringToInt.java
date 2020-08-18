package algorithm.java.hw;

//不用库函数实现数字字符转换成整数
public class StringToInt {

    public static int stringToInt(String s) {
        int result = 0;
        for(int i = s.length()-1, j = 0; i >= 0; i--){
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                result += (s.charAt(i) - '0') * Math.pow(10, j);
                j++;
            }else {
                if(i == 0 && s.charAt(i) == '-' || s.charAt(i) == '+'){
                    if(s.charAt(i) == '-')
                        result = -1 * result;
                }else {
                    System.out.println(0);
                    return 0;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
