package may2020;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        if(num < 0) return false;
        if(num == 1) return true;
        long lo = 1, hi = (long) num;
        while(lo <= hi){
            long mid = (lo + hi) / 2;
            if(mid * mid == num)
                return true;
            else if(mid * mid < num)
                lo = mid + 1;
            else
                hi = mid -1;
        }
        return false;        
    }
}
