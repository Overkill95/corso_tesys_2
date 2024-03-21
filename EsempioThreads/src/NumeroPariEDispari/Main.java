package NumeroPariEDispari;

public class Main {

	public static void main(String[] args) {
		
		Thread numeroPari = new Thread(new StampaNumeroPari());
		Thread numeroDispari = new Thread(new StampaNumeroDispari());
		
		System.out.println("Stampo dal thread Main");
		
		numeroDispari.start();
		numeroPari.start();
		
		

	}

}
