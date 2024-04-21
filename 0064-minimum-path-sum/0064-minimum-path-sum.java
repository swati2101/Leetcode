class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        int ans=solve(grid,0,0,n,m,dp);
        return ans;
    }
    int solve(int grid[][],int i,int j,int n,int m,int dp[][]){
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1)
            return dp[i][j];

        int right=/*grid[i][j]+*/solve(grid,i,j+1,n,m,dp);
        int down=/*grid[i][j]+*/solve(grid,i+1,j,n,m,dp);
        return dp[i][j]=grid[i][j]+Math.min(down,right);
    }
}