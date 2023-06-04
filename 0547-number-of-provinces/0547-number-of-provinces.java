class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        //int m=isConnected[0].length;
        
        int visited[]=new int[n];
        int count=0;
        Arrays.fill(visited,-1);
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                count++;
                dfs(isConnected,i,visited);
                
            }
        }
        return count;
    }
    void dfs(int[][] isConnected,int i,int visited[]){
        visited[i]=1;
        for(int it=0;it<isConnected.length;it++){
            if(visited[it]==-1 && isConnected[i][it]==1){
                visited[it]=1;
            dfs(isConnected,it,visited);
        }
        }
    }
}