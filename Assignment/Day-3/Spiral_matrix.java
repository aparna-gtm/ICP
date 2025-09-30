import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll=new ArrayList<>();
        clockwise_spiral(matrix,ll);
        return ll;
    }
    public static void clockwise_spiral(int[][] mat,List<Integer> ll){
        int minr=0;
        int maxr=mat.length-1;
        int minc=0;
        int maxc=mat[0].length-1;
        int c=0;
        int total=mat.length*mat[0].length;
        while(c!=total){
            for(int i=minc;i<=maxc && c!=total ;i++){
                ll.add(mat[minr][i]);
                c++;
            }
            minr++;
           

            for(int i=minr;i<=maxr&& c!=total;i++){
                ll.add(mat[i][maxc]);
                c++;
            }
            maxc--;
          

            for(int i=maxc;i>=minc && c!=total;i--){
                ll.add(mat[maxr][i]);
                c++;
            }
            maxr--;
           

            for(int i=maxr;i>=minr && c!=total;i--){
                ll.add(mat[i][minc]);
                c++;
            }
            minc++;
          
            

        }
    }
}