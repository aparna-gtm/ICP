class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                   dfs(grid,i,j);
                   ans++;
                }
            }


        }
        return ans;
    }
    public static void dfs(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='*' || grid[i][j]=='0' ){
            return;
        }
        grid[i][j]='*';
        int[] r={1,-1,0,0};
        int[] c={0,0,1,-1};
        for(int k=0;k<r.length;k++){
            dfs(grid,i+r[k],j+c[k]);
        }
    }
}