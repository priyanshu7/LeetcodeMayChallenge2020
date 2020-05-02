package may2020;

public class FirstBadVersion {
	
	public boolean isBadVersion(int n) {
		return false; // sample function --> actually an api call
	}
	
	public int firstBadVersion(int n) {
        int highest = 0;
        int lo = 1, hi = n;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            boolean isBad = isBadVersion(mid);
            if(isBad == false){
                lo = mid + 1;
                highest = Math.max(highest, mid);
            }else{
                hi = mid - 1;
            }
        }
        return highest + 1;
    }

}
