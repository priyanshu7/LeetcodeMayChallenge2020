package may2020;

public class CountSquareSubmatrices {
	
	public int countSquares(int[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int count = 0;
		for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > 0 && i > 0 && j > 0) {
					matrix[i][j] = Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i][j-1])) + 1;
				}
                count += matrix[i][j];
            }
        }
        return count;		
    }

}
