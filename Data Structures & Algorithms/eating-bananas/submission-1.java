class Solution {
    public boolean doesComplete(int[]piles,int k,int h){
        int sum=0;
        for(int pile:piles){
            sum+=Math.ceil((double)pile/k);
        }
        return sum<=h;
    }
    public int bruteForce(int[]piles,int h){
        int ans=-1;
        int i=1;
        while(true){
            if(doesComplete(piles,i,h)){
                ans=i;
                break;
            }
            i++;
        }

        return ans;

    }
    public int minEatingSpeed(int[] piles, int h) {
        return bs(piles,h);
        
    }
    public int bs(int[]piles,int h){
        int max = piles[0];
        for(int pile:piles){
            max = Math.max(pile,max);
        }
        int low=1,high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(doesComplete(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

}