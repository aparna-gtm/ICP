import java.util.*;
class Solution {
    public static void cS(int idx, int[] arr, int target, ArrayList<Integer> ll, List<List<Integer>> ans ) {
        if(target == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<arr.length; i++) {
            if(i>idx && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            ll.add(arr[i]);
            cS(i+1, arr, target-arr[i], ll, ans);
            ll.remove(ll.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        cS(0, candidates, target, new ArrayList<Integer>(), ans);
        return ans;
    }
}