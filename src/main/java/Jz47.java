
public class Jz47 {
}

class Solution47 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param grid int整型二维数组
     * @return int整型
     */
    public int maxValue (int[][] grid) {
        // write code here
        // 状态转移方程：s[k] = s[k-1] + max(grid[i+1],[j],grid[i],[j+1]);
        // 先遍历左边第一列，再遍历上面第一行
        int m = grid.length;
        int n = grid[0].length;
        for(int i=1;i<m;i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i=1;i<n;i++){
            grid[0][i] += grid[0][i-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }

    public int res(int[][] grid, int m, int n, int[][] dp){
        if(m==0&&n==0){
            return grid[m][n];
        }
        if(m == 0){
            return grid[m][n] + res(grid,m,n-1,dp);
        }
        if(n == 0){
            return grid[m][n] + res(grid,m-1,n,dp);
        }
        if(dp[m][n] == 0){
            dp[m][n] = grid[m][n] + Math.max(res(grid,m-1,n,dp),res(grid,m,n-1,dp));
        }
        return dp[m][n];
    }

    public int maxValue1 (int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        // write code here
        return res(grid,m-1,n-1,dp);
    }
}