
public class Main {

	public static void main(String[] args) {
		
		Parcheggio parcheggio = new Parcheggio(5);
		
		 for (int i = 1; i <= 10; i++) {
	            
			 	Macchina macchina = new Macchina("Macchina" + i, parcheggio);
	            Thread thread = new Thread(macchina);
	            
	            thread.start();
	            
	        }
	}

}
