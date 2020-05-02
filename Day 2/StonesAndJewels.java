package may2020;

import java.util.*;

public class StonesAndJewels {
	
	public static int numJewelsInStones(String J, String S) {
        if(J.length() == 0 || S.length() == 0) return 0;
		HashMap<Character, Integer> freqStone = new HashMap<>();
		for( char s : S.toCharArray()) {
        	freqStone.put(s, freqStone.getOrDefault(s, 0)+1);
        }
		int count = 0;
		for(char j : J.toCharArray()) {
			if(freqStone.containsKey(j)) {
				count += freqStone.get(j);
			}
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}

}
