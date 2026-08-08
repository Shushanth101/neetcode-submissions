class Solution {
    List<Integer> list;
    List<List<Integer>> slist;
    public void solve(int[]nums,int idx,int target){
        if(target==0){
            slist.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || idx>=nums.length) return;
        list.add(nums[idx]);
        solve(nums,idx,target-nums[idx]);
        list.remove(list.size()-1);
        solve(nums,idx+1,target);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        slist = new ArrayList<>();
        list = new ArrayList<>();
        solve(nums,0,target);
        return slist;
        
    }
}
