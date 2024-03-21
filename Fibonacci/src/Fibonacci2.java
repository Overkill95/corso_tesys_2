
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci dimensione array");
		
		int n = scanner.nextInt();
		if(n <= 1) {
			System.out.println("devi inserire un numero maggiore ad 1");
		}
		else {
			int[] arr = new int [n];
		
			arr[0] = 0;
			arr[1] = 1;
		
		
			for(int i = 2; i < arr.length ; i++) {
			
			arr[i] = arr[i-1] + arr[i-2];
			
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
