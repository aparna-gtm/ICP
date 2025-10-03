import java.util.*;
class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=search(board,word,i,j,0);
                    if(ans==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,String word,int cr,int cc,int idx){
        if(idx>=word.length()){
            return true;
        }
        if(cr>= board.length || cc >=board[0].length || cr<0 || cc<0 || board[cr][cc]!=word.charAt(idx)){
            return false;
        }
        board[cr][cc]='*';
        int[] r={0,0,1,-1};
        int[] c={1,-1,0,0};
        for(int i=0;i<c.length;i++){
            boolean ans= search(board,word,cr+r[i],cc+c[i],idx+1);
            if(ans==true){
                return true;
            }
        }
        board[cr][cc]=word.charAt(idx);
        return false;
    }
}