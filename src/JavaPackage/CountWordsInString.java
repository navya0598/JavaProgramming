package JavaPackage;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a QA Engineer";
		
		System.out.println(countWords(str));

	}

	public static int countWords(String str) {
		// Remove all the extra spaces
		str = str.trim();

		// Check if string is empty
		if (str.isEmpty()) {
			return 0;
		}
		// Split the string by one or more spaces
        String[] words = str.split("\\s+");
        
        // Return the length of the array, which is the number of words
        return words.length;
	}

}
