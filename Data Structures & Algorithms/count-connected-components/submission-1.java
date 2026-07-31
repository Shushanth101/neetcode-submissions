class Solution {
    boolean vis[];
    public ArrayList<ArrayList<Integer>> toAdjList(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        return adjList;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adjList){
        vis[node]=true;
        for(int it:adjList.get(node)){
            if(vis[it]==false){
                dfs(it,adjList);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
        vis=new boolean[n];
        int count=0;
        ArrayList<ArrayList<Integer>> adjList = toAdjList(n,edges);
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                dfs(i,adjList);
                count++;
            }
        }
        return count;



    }
}
