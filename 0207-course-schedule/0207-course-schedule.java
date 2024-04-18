class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList < > ());
        }
        for(int i=0;i<prerequisites.length;i++){
                adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
            //adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int j=0;
        while(q.size()>0){
            int temp=q.remove();
            ans.add(temp);
            for(int it:adj.get(temp)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(ans.size()==numCourses){
            return true;
        }
        return false;
    }
}