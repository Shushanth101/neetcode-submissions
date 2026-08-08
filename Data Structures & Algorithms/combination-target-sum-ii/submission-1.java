class Solution {
    List<List<Integer>> ans;
    public void backtrack(int idx,List<Integer> comb,int[]candidates,int target){
        if(target==0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            comb.add(candidates[i]);
            backtrack(i+1,comb,candidates,target-candidates[i]);
            comb.removeLast();
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> comb = new ArrayList<>();
        ans = new ArrayList<>();
        backtrack(0,comb,candidates,target);
        return ans;
        
    }
}
