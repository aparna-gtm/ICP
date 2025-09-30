import java.util.*;
public class Traversal_matrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{-9,4,90,89},{50,33,8,9},{-90,-9,-8,-1}};
        // rowwise(mat);
        // colwise(mat);
        // primary_diagonal_print(mat);
        // secondary_diagonal_print(mat);
        // reverse(mat);
        // zigzag(mat);
        clockwise_spiral(mat);
        anti_clockwise_spiral(mat);
        
    }
    public static void rowwise(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void colwise(int[][] mat){
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void primary_diagonal_print(int[][] mat){
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void secondary_diagonal_print(int[][] mat){
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                if((i+j)==mat.length-1){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void reverse(int[][] mat){
        for(int i=mat.length-1;i>=0;i--){
            for(int j=mat[i].length-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void zigzag(int[][] mat){
        for(int i=0;i<mat.length;i++){
            
                if(i%2==0){
                    for(int j=0;j<mat[i].length;j++){
                        System.out.print(mat[i][j]+" ");
                    }
                    
                }
                else{
                    for(int j=mat[i].length-1;j>=0;j--){
                        System.out.print(mat[i][j]+" ");
                    }
                }
                System.out.println();
            }
    }
    public static void clockwise_spiral(int[][] mat){
        int minr=0;
        int maxr=mat.length-1;
        int minc=0;
        int maxc=mat[0].length-1;
        int c=0;
        int total=mat.length*mat[0].length;
        while(c!=total){
            for(int i=minc;i<=maxc && c!=total ;i++){
                System.out.print(mat[minr][i]+" ");
                c++;
            }
            minr++;
           

            for(int i=minr;i<=maxr&& c!=total;i++){
                System.out.print(mat[i][maxc]+" ");
                c++;
            }
            maxc--;
          

            for(int i=maxc;i>=minc && c!=total;i--){
                System.out.print(mat[maxr][i]+" ");
                c++;
            }
            maxr--;
           

            for(int i=maxr;i>=minr && c!=total;i--){
                System.out.print(mat[i][minc]+" ");
                c++;
            }
            minc++;
          
            

        }
    }
    public static void anti_clockwise_spiral(int[][] mat){
        List<Integer> ll=new ArrayList<>();
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
        Collections.reverse(ll);
        System.out.println(ll);
    }
    


}
