package practice.Backtracking;

public class exist_79 {
    private int rows; //二维数组的行
    private int cols; //列
    private int len;  //记录word的长度
    private boolean[][] visited; //记录节点是否被访问过
    private char[] charArray;
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        len  = word.length();
        visited = new boolean[rows][cols];
        charArray = word.toCharArray();
        this.board=board;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int i,int j,int index){
        if (index>=len)  return true;
        if (i<0||j<0||i>=rows||j>=cols||charArray[index]!=board[i][j]||!visited[i][j])
            return false;
        visited[i][j] = true;
        boolean res = dfs(i-1, j, index+1)||dfs(i+1,j,index+1)
                ||dfs(i, j-1, index+1)||dfs(i, j+1, index+1);
        visited[i][j] = false;
        return res;
    }

}
