public class Macchina implements Runnable{
	
	String nome;
	private Parcheggio parcheggio;
	
	
	public Macchina (String nome, Parcheggio parcheggio) {
		this.nome = nome;
		this.parcheggio = parcheggio;
	}


	@Override
	public void run() {
		
		while (true) {
          
			try {
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
            synchronized (parcheggio) {
                parcheggio.entra();
                System.out.println(nome + ": è entrata nel parcheggio i posti liberi sono:" + parcheggio.posti);
            } 
            
            
            try {
                Thread.sleep((int) (Math.random() * 150000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized (parcheggio) {
                parcheggio.esce();
                System.out.println(nome + ": ha lasciato il parcheggio i posti liberi sono:" + parcheggio.posti);
            } 
        } 
    } 
		
	

}
