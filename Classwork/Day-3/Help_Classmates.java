import java.util.*;

class Solution {
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=arr[st.peek()];
            }
            else{
                ans[i]=-1;
            }
            st.push(i);
        }
        return ans;
    }
}
