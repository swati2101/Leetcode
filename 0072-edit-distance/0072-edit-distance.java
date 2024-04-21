class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return solve(word1,word2,0,0,dp);
        
    }
    public int solve(String word1,String word2,int i,int j,int dp[][]){
        if(i==word1.length()&&j==word2.length()){
            return 0;
        }
        if(i==word1.length())
            return word2.length()-j;
        if(j==word2.length())
            return word1.length()-i;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            return solve(word1,word2,i+1,j+1,dp);
        }
        int insert=solve(word1,word2,i,j+1,dp);
        int delete=solve(word1,word2,i+1,j,dp);
        int replace=solve(word1,word2,i+1,j+1,dp);
        return dp[i][j]=1+Math.min(insert,Math.min(delete,replace));
    }
    
}