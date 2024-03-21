package NumeroPariEDispari;

public class StampaNumeroDispari implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i < 10; i+= 2) {
			System.out.println("numero disparo: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
