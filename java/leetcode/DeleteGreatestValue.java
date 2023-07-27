package algorithm.java.leetcode;

//2500. 删除每行中的最大值
public class DeleteGreatestValue {
    public int deleteGreatestValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        while (col > 0){
            int colMax = 0;
            for(int i = 0; i < row; i++){
                int rowMax = 0, index = 0;
                for(int j = 0; j < col; j++){
                    if(grid[i][j] > rowMax){
                        rowMax = grid[i][j];
                        index = j;
                    }
                }
                if(index != col - 1){
                    grid[i][index] = grid[i][col - 1];
                }
                if(rowMax > colMax){
                    colMax = rowMax;
                }
            }
            col--;
            sum += colMax;
        }
        return sum;
    }
}
