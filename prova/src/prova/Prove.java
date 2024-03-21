package prova;

import java.util.Arrays;

public class Prove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeri = {10,2,4,1};
		
		System.out.println(Arrays.toString(numeri));
		
		for(int i = 0; i < numeri.length; i++) {
			for(int j= 0; j < numeri.length - 1; j++) {
				if(numeri[j] >= numeri[j+1]) {
					int x = numeri[j];
					numeri[j] = numeri[j+1];
					numeri[j+1] = x;
					
				}
			}
			
		}
		System.out.println("l'array ordinato in ordine crescente " + Arrays.toString(numeri));
		
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println(i);
		}
		
		int base = 10;
		int altezza = 20;
		System.out.println(calcolaArea(base, altezza));
		
		calcolaArea2(base,altezza);
		
	
	}
		
	public static int calcolaArea(int x, int y) {
			return  x*y;
			
		}
	
	public static void calcolaArea2(int x, int y) {
		int are= x*y;
		System.out.println("funzione 2 " + are);
		return;
		
	}
}
