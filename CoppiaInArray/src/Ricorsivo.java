import java.util.Arrays;
import java.util.Scanner;

public class Ricorsivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci ampiezza array");
		int n = scanner.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Inserisci  l'elemento " + i + " dell'array");
			arr[i] = scanner.nextInt();
			
		}
		
		
		System.out.println(numeroCoppie(arr,0,0));
	
		
	}

	
	public static int numeroCoppie(int[] array,int n, int count) {
	 
		if(n < array.length-1) {
	    if (array[n] == array[n+1]) {
	        count += 1;  
	       
	        }
	    return numeroCoppie(array,n+1,count); 
		}
	     return count; 
	    
	  
	}

}
