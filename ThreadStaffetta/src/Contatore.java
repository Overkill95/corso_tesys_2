
public class Contatore {
	  
	private int count = 0;

	    synchronized void increment() {
	    	System.out.println("SONO IL THREAD " + Thread.currentThread().getName());
	        count++;
	        System.out.println("Incremento: " + count);
	    }
}
