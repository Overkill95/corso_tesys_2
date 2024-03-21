package Contatore;

public class Contatore {
	
	    private int count = 0;

	    synchronized void increment() {
	        count++;
	        System.out.println("Incremento: " + count);
	    }

	    synchronized void decrement() {
	        count--;
	        System.out.println("Decremento: " + count);
	    }
	
}
