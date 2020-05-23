package may2020;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {
	public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A.length == 0 || B.length == 0)
            return new int[0][0];
        List<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < A.length && j < B.length){
            if(B[j][1] < A[i][0]){
                j++;
                continue;
            }
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);
            if(start <= end){
                ans.add(new int[]{start,end});
            }
            
            if(A[i][1] <= B[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
