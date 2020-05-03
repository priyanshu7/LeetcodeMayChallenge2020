package may2020;

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] note = new int[26];
        int[] mag = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            note[ransomNote.charAt(i) % 97] += 1;
        }
        for(int i = 0; i < magazine.length(); i++){
            mag[magazine.charAt(i) % 97] += 1;
        }
        for(int i = 0; i < 26; i++){
            if(note[i] > mag[i]){
                return false;
            }
        }
        return true;
    }

}
