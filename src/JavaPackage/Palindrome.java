package JavaPackage;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original="MADAM"; 
		 String	 reverse = ""; // Objects of String class  
	     
	      for ( int i = original.length() - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   

	}

}
