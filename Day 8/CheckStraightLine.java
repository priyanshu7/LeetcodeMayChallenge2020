package may2020;

public class CheckStraightLine {
	
	public float getSlope(int[] p, int[] q){
        if(q[0] - p[0] == 0) return 0;
        return (float)(q[1]-p[1])/(q[0]-p[0]);
    }
    
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2){
            return true;
        }
        float slope = getSlope(coordinates[0], coordinates[1]);
        for(int i = 2; i < coordinates.length; i++){
            if(slope != getSlope(coordinates[i-1], coordinates[i])){
                return false;
            }
        }
        return true;
    }

}
