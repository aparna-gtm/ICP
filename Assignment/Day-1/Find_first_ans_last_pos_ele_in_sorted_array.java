class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;

        int left=bs(nums,target,true);
        if(left==-1){
            return ans;
        }
        int right=bs(nums,target,false);
        ans[0]=left;
        ans[1]=right;
        return ans;
    }
    public static int bs(int[] nums,int target,boolean left){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                if(left==true){
                    ans=mid;
                    end=mid-1;
                }
                else{
                    ans=mid;
                    start=mid+1;
                }
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}