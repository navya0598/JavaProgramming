package JavaPackage;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input_string = "Hello";
		String output_string="";
		
		for (int i=input_string.length()-1;i>=0;i--) {
			output_string= output_string+input_string.charAt(i);
		}
		System.out.println("String before reverse:\t"+input_string);
		System.out.println("String after reverse:\t"+output_string);

	}

}
