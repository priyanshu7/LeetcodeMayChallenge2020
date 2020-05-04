package may2020;

public class NumberComplement {
	
	public int findComplement(int num) {
        int num_bits = (int) (Math.floor(Math.log(num) / Math.log(2))) + 1;
        return ((1 << num_bits) - 1) ^ num;
    }

}
