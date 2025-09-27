import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TLE
        // int[] ans=new int[nums.length];
        // int idx=0;
        // for(int i=0;i<=nums.length-k;i++){
        //     int max=Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //         max=Math.max(max,nums[j]);
        //     }
        //     ans[idx++]=max;
        // }
        // return Arrays.copyOfRange(ans,0,idx);

        // using a dequeue

        int n = nums.length;
        int[] ans= new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;

    }
}