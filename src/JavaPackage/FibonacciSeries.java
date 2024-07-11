package JavaPackage;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter the number of terms in the Fibonacci series: ");
//	        int n = scanner.nextInt();
	        int n = 10;
	        // Initialize the first two Fibonacci numbers
	        int first = 0, second = 1;
	        System.out.println("Fibonacci Series:");
	        
	        // Print the first and second Fibonacci numbers
	        System.out.print(first + " ");
	        if (n > 1) {
	            System.out.print(second + " ");
	        }
	        
	        // Compute and print the rest of the Fibonacci numbers
	        for (int i = 2; i < n; i++) {
	            int next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	        }
	        
	        //scanner.close();

	}

}
