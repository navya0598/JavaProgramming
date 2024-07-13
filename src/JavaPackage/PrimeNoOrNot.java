package JavaPackage;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPrime(8));

	}
	public static boolean checkPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i =2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
