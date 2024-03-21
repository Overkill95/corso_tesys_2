
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci dimensione array");
		
		int n = scanner.nextInt();		
		int[] arr = new int [n];
		
		
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			if(arr[i] == 0) {
				arr[i+1]=1;
			}
			else {
				arr[i+1]= arr[i] + arr [i-1];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
