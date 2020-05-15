package may2020;

public class MaxSumCircularSubArray {
	
	public int kadanes(int[] nums) {
		int cmax = nums[0], omax = nums[0];
		for(int i = 1; i < nums.length ; i++) {
			if(cmax > 0) {
				cmax = cmax + nums[i];
			}
			else {
				cmax = nums[i];
			}
			if (omax < cmax) 
		        omax = cmax; 
		}
		return omax;
	}
    
    public int maxSubarraySumCircular(int[] A) {
        if(A.length == 0) return 0;
        int max_kadane = kadanes(A);
        int max_sum = 0;
        for(int i=0; i<A.length;i++){
            max_sum += A[i];
            A[i] *= -1;
        }
        int max_wrap = kadanes(A);
        return (max_sum + max_wrap == 0) ? max_kadane : Math.max(max_kadane, max_sum + max_wrap);
    }

}
