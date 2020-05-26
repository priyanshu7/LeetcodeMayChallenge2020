package questions;

import java.util.HashMap;

public class ContiguousArray {
	
	public static int maxLen(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int ans = 0;
		int count = 0;
		for(int i = 0; i < nums.length ; i++) {
			if(nums[i] == 0) count--;
			else count++;
			
			if(count == 0) {
				System.out.println(i);
			}
			
			if(map.containsKey(count)) {
				ans = Math.max(ans, i-map.get(count));
			}else {
				map.put(count,i);
			}
		}
		
		return ans;
	}
	
	  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,1,0,0,1,1,1};
		System.out.println(maxLen(arr));

	}

}
