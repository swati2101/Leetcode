class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<List<Integer>> q=new LinkedList<>();
        q.add(Arrays.asList(0));
        while(q.size()>0){
            List<Integer> path=q.remove();
            if(path.get(path.size()-1)==graph.length-1){
                res.add(new ArrayList<>(path));
            }
            else{
                for(int i=0;i<graph[path.get(path.size()-1)].length;i++){
                    List<Integer> list = new ArrayList(path);
                    list.add(graph[path.get(path.size()-1)][i]);
                    q.add(list);
                }
            }
        }
        return res;
    }
}