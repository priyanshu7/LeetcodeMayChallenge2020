package may2020;

import java.util.*;

public class KClosestPointsToOrigin {
	
	public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> -a[0] * a[0] - a[1] * a[1]));
        for (int[] p : points) { 
            pq.offer(p); 
            if (pq.size() > K) { pq.poll(); } 
        }
        int[][] ans = new int[K][2];
        while (K-- > 0) { ans[K] = pq.poll(); }
        return ans;
    }
	
	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int[][] ans = kClosest(points, 2);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
	}

}
