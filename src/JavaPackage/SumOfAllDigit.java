package JavaPackage;

public class SumOfAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 876;
		System.out.println(sumOfDigit(num));

	}
	public static int sumOfDigit(int number) {
		int sum =0;
		while(number!=0) {
			int rem = number %10;
			sum = sum+rem;
			number = number/10;
		}
		return sum;
	}

}
