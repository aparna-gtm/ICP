import java.util.*;
class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=n;
        while(!st.isEmpty()){
                int h=arr[st.pop()];
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
        }
        return ans;
    }
}