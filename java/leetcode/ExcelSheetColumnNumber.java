package algorithm.java.leetcode;

//171. Excel 表列序号
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return ans;
    }
}
