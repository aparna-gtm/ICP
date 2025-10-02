import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        int remove=0;
        int p0=intervals[0][0];
        int p1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<p1){
                p0=Math.min(intervals[i][0],p0);
                p1=Math.min(intervals[i][1],p1);
                remove++;
            }
            else if(intervals[i][1]==p1 && intervals[i][0]==p0){
                p0=intervals[i][0];
                p1=intervals[i][1];
                remove++;

            }
            else{
                p0=intervals[i][0];
                p1=intervals[i][1];
            }
        }
        return remove;
    }
}