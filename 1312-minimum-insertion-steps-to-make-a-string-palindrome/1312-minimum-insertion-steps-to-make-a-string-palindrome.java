class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        Integer dp[][]=new Integer[n][n];
        return solve(0,n-1,s,dp);
    }
    public int solve(int i,int j,String s,Integer dp[][]){
        
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return solve(i+1,j-1,s,dp);
        }
        int first=1+solve(i,j-1,s,dp);
        int last=1+solve(i+1,j,s,dp);
        return dp[i][j]=Math.min(last,first);
    }
}