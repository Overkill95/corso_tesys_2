
public class Main {

	public static void main(String[] args) {
		
		Contatore count = new Contatore();
		
	
		Thread thread1 = new Thread(new Threads(count));
		Thread thread2 = new Thread(new Threads(count));
		Thread thread3 = new Thread(new Threads(count));
		
		
		
		thread1.start();
		
		 try {
	            thread1.join(); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 
		thread2.start();
		
		 try {
	            thread2.join(); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		thread3.start();
		
		try {
		    
		    thread3.join();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println("ha vinto il thread 3");

	}

}
