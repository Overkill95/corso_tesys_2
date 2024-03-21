package Contatore;

public class Decremento implements Runnable{
	private final Contatore counter;
	
	Decremento(Contatore counter){
		this.counter = counter;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			counter.decrement();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
