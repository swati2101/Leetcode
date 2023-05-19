class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
                if(color[i]==-1){
                    if(!dfs(i,graph,color))
                    {
                        return false;
                    }
                }
        }
        return true;
    }
    public boolean dfs(int i,int graph[][],int color[]){

        for(Integer it:graph[i]){
            if(color[it]==-1){
                color[it]=1-color[i];
                if(!dfs(it,graph,color)){
                    return false;
                }
            }
            else if(color[i]==color[it]){
                        return false;
                    }
                }
            return true;
        }
        
    
}