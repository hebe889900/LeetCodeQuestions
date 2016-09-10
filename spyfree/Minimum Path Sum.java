public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        
        if(m==0)
            return 0;
        
        int n = grid[0].length;
        
        int[][] path = new int[m][n];
        
        path[m-1][n-1] = grid[m-1][n-1];
        
        if(m==1||n==1){
            if(m==1&&n==1)
                return grid[0][0];
            else if(m==1){
                for(int i=n-2;i>=0;--i){
                    path[m-1][i] = path[m-1][i+1] + grid[m-1][i];
                }
            }
            else{
                for(int i=m-2;i>=0;--i){
                    path[i][n-1] = path[i+1][n-1] + grid[i][n-1];
                }
            }
            
            return path[0][0];
        }
        
        for(int i=n-2;i>=0;--i)
        {
            path[m-1][i] = path[m-1][i+1] + grid[m-1][i];
        }
        
        for(int i=m-2;i>=0;--i)
        {
            path[i][n-1] = path[i+1][n-1] + grid[i][n-1];
        }
        
        
        for(int i=m-2;i>=0;--i){
            for(int j=n-2;j>=0;--j){
                path[i][j] = grid[i][j] + Math.min(path[i+1][j],path[i][j+1]);
            }
        }
        
        return path[0][0];
        
        
    }
}
