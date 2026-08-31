class Solution {
    public boolean doesSatisfy(int[] weights,int k,int t){
        int count=1;
        int sum=0;
        for(int weight:weights){
            if(weight>k) return false;
            if(sum+weight>k){
                sum=weight;
                count++;
            }else
            sum+=weight;
        }
        return count<=t;
    }
    public int bs(int[]weights,int t){
        int sum=0;
        for(int weight:weights){
            sum+=weight;
        }
        int l=1,h=sum;
        int ans=-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(doesSatisfy(weights,mid,t)){
                ans=mid;
                h=mid-1;
            }else l=mid+1;                                                 
        }

        return ans;

    }
    public int shipWithinDays(int[] weights, int days) {
        return bs(weights,days);
        
    }
}