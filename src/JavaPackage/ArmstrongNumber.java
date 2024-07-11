package JavaPackage;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check if it is Armstrong or not : ");
		int number = scan.nextInt();
		
		if(Armstrong(number)) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is not Armstrong");
		}
	}
	public static boolean Armstrong(int number) {
		int originalnumber = number;
		int numDigits=String.valueOf(number).length();
		int sum= 0;
		
		while(number>0) {
			int digit = number%10;
			sum+=Math.pow(digit, numDigits);
			number = number/10;
			
		}
		
		return sum==originalnumber;
	}

}
