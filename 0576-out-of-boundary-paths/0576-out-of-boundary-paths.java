class Solution {
    int mod=1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int dp[][][]=new int[m][n][maxMove+1];
        for(int a[][]:dp)
        {
            for(int b[]:a)
            Arrays.fill(b,-1);
        }
       return solve(m,n,maxMove,startRow,startColumn,dp);
    }
    int solve(int m, int n, int max, int row, int col,int dp[][][])
    {
        if(row<0 || row>=m || col<0 || col>=n)
        return 1;
        if(max==0)
        return 0;
        if(dp[row][col][max]!=-1)
        return dp[row][col][max];
        int up=solve(m,n,max-1,row-1,col,dp);
        int left=solve(m,n,max-1,row,col-1,dp);
        int right=solve(m,n,max-1,row+1,col,dp);
        int down=solve(m,n,max-1,row,col+1,dp);
        dp[row][col][max]=((up+left)%mod+(right+down)%mod)%mod;
        return dp[row][col][max];
    }
}