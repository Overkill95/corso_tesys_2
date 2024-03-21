import java.util.Scanner;

public class FibonacciMetodoNonRicorsivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci grandezza array");
		
		int n = scanner.nextInt();
		fibonacciIn(n);
		
		
	}
	
	public static void fibonacciIn(int n) {
		
		int firstNum = 0;
		int secondNum = 1;
		int nextNum = 0;

		
		 for(int i = 0; i < n; i++) {
			 System.out.print(firstNum + ",");
			 nextNum = firstNum + secondNum;
			 firstNum= secondNum;
			 secondNum = nextNum;
		}
		 
	}
	
	
	

}
