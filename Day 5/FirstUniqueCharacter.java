package may2020;

import java.util.*;

public class FirstUniqueCharacter {
	
	/* Two Pass Algorithm using Hashmap */
	
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
        	if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
	
	/* Single Pass Algorithm using LinkedHashMap */
	
	public static int firstUniq(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))) {
				if(map.get(s.charAt(i)) != null) {
					map.remove(s.charAt(i));
				}
			}else {
				map.put(s.charAt(i), i);
				set.add(s.charAt(i));
			}
		}
		return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
	}
	
	/* Two Pass Algorithm using Array */
	
	 public int firstUniqCharArr(String s) {
	        char[] cA = new char[26];
	        
	        for (char c : s.toCharArray()) {
	            cA[c - 'a']++;
	        }
	        
	        for (int i = 0; i < s.length(); i++) {
	            if (cA[s.charAt(i) - 'a'] == 1) {
	                return i;
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(firstUniq("leetcodelove"));

	}

}
