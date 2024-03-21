package Contatore;

public class Incremento implements Runnable{
	private final Contatore counter;
	
	Incremento(Contatore counter){
		this.counter = counter;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			counter.increment();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
