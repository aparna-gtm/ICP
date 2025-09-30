class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int i=0;
        int j=0;
        int idx=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                ans[idx++]=nums2[j];
                j++;

            }
            else if(nums1[i]<nums2[j]){
                ans[idx++]=nums1[i];
                i++;
            }
            else{
                ans[idx++]=nums1[i];
                ans[idx++]=nums1[i];
                i++;
                j++;
            }
        }
        while(i<m){
            ans[idx++]=nums1[i];
            i++;
        }
        while(j<n){
            ans[idx++]=nums2[j];
            j++;
        }
        for(int k=0;k<nums1.length;k++){
            nums1[k]=ans[k];
        }
    }
}