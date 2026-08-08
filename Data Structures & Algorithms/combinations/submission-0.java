class Solution {
    List<List<Integer>> ans;
    public void backtrack(int start,List<Integer> comb,int k,int n){
        if(comb.size()==k){
            ans.add(new ArrayList<>(comb));
            return;
        }

        for(int i=start;i<=n;i++){
            comb.add(i);
            backtrack(i+1,comb,k,n);
            comb.remove(comb.size()-1);
        }
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> comb = new ArrayList<>();
        ans = new ArrayList<>();
        backtrack(1,comb,k,n);
        return ans;
        
    }
}