package may2020;

import java.util.*;

public class FindAnagrams {
	
	
	public static List<Integer> findAnagrams(String s, String p) {
        if(s.length() == 0 || s.length() < p.length()) return new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();
        for(char c : p.toCharArray()) {
        	pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < p.length(); i++) {
        	sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        int i = 0, j = p.length()-1;
        for(; j < s.length();) {
        	if(pMap.equals(sMap)) {
        		ans.add(i);
        	}
        	sMap.put(s.charAt(i), sMap.get(s.charAt(i)) - 1);
        	if(sMap.get(s.charAt(i)) == 0) {
        		sMap.remove(s.charAt(i));
        	}
        	i++;
        	j++;
        	if(j < s.length()) {
        		sMap.put(s.charAt(j), sMap.getOrDefault(s.charAt(j), 0)+1);
        	}
        	
        }
        return ans;
    }
	
	
	public static List<Integer> findAnagram(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return ans;
    
        int[] hash = new int[26]; 
    
        for (char c : p.toCharArray()) {
        	hash[c-'a']++;
        }
 
        int left = 0, right = 0, count = p.length();
    
        while (right < s.length()) {

        	if (hash[s.charAt(right) - 'a'] >= 1) {
        		count--;
        	}
        	hash[s.charAt(right) - 'a']--;
        	right++;
        

        	if (count == 0) {
        		ans.add(left);
        	}

        	if (right - left == p.length() ) {
           
        		if (hash[s.charAt(left)- 'a'] >= 0) {
        			count++;
        		}
        		hash[s.charAt(left) - 'a']++;
        		left++;
        
        	}

        
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "abab";
		String p = "ab";
		System.out.println(findAnagram(s,p).toString());

	}

}
