class Solution {
    public void solve(int[]nums,int idx,List<Integer>list,List<List<Integer>> slist){
        if(idx>=nums.length){
            slist.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        solve(nums,idx+1,list,slist);
        list.remove(list.size()-1);
        solve(nums,idx+1,list,slist);
    }

    public int subsetXORSum(int[] nums) {
        List<List<Integer>> slist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(nums,0,list,slist);
        int sum=0;
        for(List<Integer> list1:slist){
            if(list1.size()==0) continue;
            else if(list1.size()==1){
                sum+=list1.get(0);
            }
            else {
                int xor=list1.get(0);
                for(int i=1;i<list1.size();i++){
                    xor^=list1.get(i);
                }
                sum+=xor;
            }

        }

        return sum;
        
    }
}