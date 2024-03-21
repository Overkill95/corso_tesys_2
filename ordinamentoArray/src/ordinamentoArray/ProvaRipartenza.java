package ordinamentoArray;

import java.util.Arrays;
import java.util.Scanner;

public class ProvaRipartenza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci dimensione array");
		
		int arrSize = scanner.nextInt();
		
		System.out.println("la dimensione che hai inserito è " + arrSize + " vuoi continuare y/n ");
		
		String risposta = scanner.next();
		
		 if(risposta.equals("n"))
             restart(args);
		 else {
		
		int[] numeri = new int[arrSize];
		
		
		for(int i = 0; i <= numeri.length - 1; i++) {
			int j = i+1;
			System.out.println("inserisci il " + j + " elemento");
			numeri[i] = scanner.nextInt();
		}
			
		System.out.println("Complimenti! Ecco il tuo array "+  Arrays.toString(numeri));
		
		for(int i = 0; i < numeri.length -1; i++) {
			for(int j = i + 1; j < numeri.length; j++) {
				if(numeri[i] > numeri [j]) {
					int numAppoggio = numeri[j];
					numeri[j] = numeri[i];
					numeri[i]= numAppoggio;
				}
			}
		}
		
		System.out.println("ecco il tuo array in ordine cresente ;-) " + Arrays.toString(numeri));
		
		scanner.close();
		 }
		
	}
	
	  private static void restart(String[] strArr)
	    {
	        System.out.println("RESTART...");
	        main(strArr);
	    }

}



