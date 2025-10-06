class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            dp[i]=-1;
        }
        return helper(nums,0,dp);
    }
    public int helper(int[] nums,int idx,int[] dp){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];

        int rob=helper(nums,idx+2,dp) +nums[idx];
        int dont_rob=helper(nums,idx+1,dp);
        return dp[idx]=Math.max(rob, dont_rob);
    }
}