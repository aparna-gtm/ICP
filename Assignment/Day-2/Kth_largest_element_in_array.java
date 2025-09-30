import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(!pq.isEmpty()){
            k--;
            int x=pq.poll();
            if(k==0){
                return x;
            }
          
        }
        return -1;
    }
}