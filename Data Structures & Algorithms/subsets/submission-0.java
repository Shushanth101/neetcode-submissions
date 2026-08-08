class Solution {
    public void recursiveSolution(int idx,int[] nums,
                                                    List<Integer>list,
                                                    List<List<Integer>> slist){
        if(idx>=nums.length){
            slist.add(new ArrayList<>(list));
            return;
        }
        //case1: take this current number
        list.add(nums[idx]);
        recursiveSolution(idx+1,nums,list,slist);

        //case2: dont take this current number
        list.remove(list.size()-1);
        recursiveSolution(idx+1,nums,list,slist);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recursiveSolution(0,nums,list,ans);
        return ans;
        
    }
}