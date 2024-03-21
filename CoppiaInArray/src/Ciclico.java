import java.util.Arrays;
import java.util.Scanner;

public class Ciclico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci grandezza Array");
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Inserisci  l'elemento " + i + " dell'array");
			arr[i] = scanner.nextInt();
			
		}
		
		System.out.println("Ecco il tuo array " + Arrays.toString(arr));

		int count = 0;
		
		for(int j = 0; j < arr.length-1; j++) {
				
			if(arr[j] == arr[j+1] ) {
				count += 1;
				}
		}
		
		System.out.println("le coppie sono " + count);	
	}

}
