//DFS for flood fill
//Time Complexity: m*n
//Space Complexity: m*n


class Solution {
    int[][] dirs = new int [][] {{0,1},{0,-1},{1,0},{-1,0}};
    int color;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        //DFS Solution
        
        if(image == null || image [sr][sc] == newColor )return image;
        color = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        dfs(image, sr,sc,newColor, m , n);
        return image;  
    }
    
    private void dfs(int[][] image , int sr, int sc, int newColor, int m, int n)
    {

        if(sr <0 || sc< 0 || sr >=m || sc >=n || image[sr][sc] != color)return;
        
        //logic
        image[sr][sc] = newColor;
        for(int [] dir : dirs )
        {
            int nr = sr + dir[0];
            int nc = sc + dir[1];
            dfs(image, nr, nc,newColor,m, n );
        }
        
    }
}