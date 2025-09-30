public class Lower_bound {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,7,9};
        int target=8;
        if(target<arr[0]) 
        {
            System.out.println(arr[0]);
            return;
        }
        else if(target>arr[arr.length-1]){
            System.out.println(-1);
            return;
        }
        else{
            int low=0;
            int high=arr.length-1;
            while(low<high){
                int mid=(low+high)/2;
               
                if(arr[mid]>=target){
                    high=mid;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println(low);
            //System.out.println(high);
        }

    }
}
