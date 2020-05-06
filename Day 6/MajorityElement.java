package may2020;

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
        int count=0, ret = 0;
    for (int num: nums) {
        if (count==0)
            ret = num;
        if (num!=ret)
            count--;
        else
            count++;
    }
    return ret;
    }

}
