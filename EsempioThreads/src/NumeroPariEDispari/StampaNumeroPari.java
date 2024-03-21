package NumeroPariEDispari;

public class StampaNumeroPari implements Runnable{

	@Override
	public void run() {
		for(int i = 2; i < 10; i += 2) {
			System.out.println("numero paro: " + i);
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
