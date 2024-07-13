package JavaPackage;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateString("NavyatestingAcademy");

	}
	public static void duplicateString(String str) {
		// Creating a hashmap object.
		HashMap<Character,Integer> hm = new HashMap<>();
		//Convert String to char array
		char[] charArray=str.toCharArray();
		
		for(char c : charArray) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		// Store the key values in a set and then get the number of each duplicate character.
		Set<Character> keys=hm.keySet();	
		for(char c:keys) {
			if(hm.get(c)>1) {
				System.out.println(c+"--------"+hm.get(c));
			}
		}
	}

}
