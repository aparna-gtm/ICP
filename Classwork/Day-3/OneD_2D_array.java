import java.util.*;
public class OneD_2D_array {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7,8,9};
        
        int r=3;
        int c=3;
        int[][] mat=new int[r][];
        int idx=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=arr[idx++];
            }
        }
        for(int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
