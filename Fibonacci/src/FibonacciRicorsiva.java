
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciRicorsiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci grandezza array");
		
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < arr.length ; i ++) {
			
			arr[i] = fibonacciIn(i);
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

	
	public static int fibonacciIn(int n) {
		if ( n == 0)
			return 0;
		else if ( n == 1 )
			return 1;
		else 
			return fibonacciIn(n-1) + fibonacciIn(n-2);
	}
}
