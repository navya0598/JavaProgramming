package JavaPackage;

public class ReverseAnArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		System.out.println(charArray);
	}

}
