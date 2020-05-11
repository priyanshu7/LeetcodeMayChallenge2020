package may2020;

import java.util.Arrays;

public class FloodFill {
	
	public static void dfs(int[][] image, int newColor, int color, int sr, int sc,boolean[][] visited) {
		image[sr][sc] = newColor;
		visited[sr][sc] = true;
	    int[] row = {-1,0,1,0};
	    int[] col = {0,-1,0,1};
	    
	    for(int i = 0; i < 4; i++) {
	    	int r = sr + row[i];
	    	int c = sc + col[i];
	    	if(r >= 0 && r < image.length && c >= 0 && c < image[0].length && image[r][c] == color && visited[r][c] == false) {
	    		dfs(image, newColor, color, r, c,visited);
	    	}
	    }
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image.length == 0) return new int[0][0];
		if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
        	return image;
		int color = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
		dfs(image, newColor, color, sr, sc, visited);
		
		return image;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{0,0,0},{0,1,1}};
		int[][] ans = floodFill(arr,1,1,1);
		
		System.out.println(Arrays.toString(ans[1]));

	}

}
