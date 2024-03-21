package Contatore;

public class Main {

	public static void main(String[] args) {
		
		Contatore counter = new Contatore();
		
		Incremento incremento = new Incremento(counter);
		Decremento decremento = new Decremento(counter);
		
		Thread incrementoThread = new Thread(incremento);
		Thread decrementoThread = new Thread(decremento);
		
		incrementoThread.start();
		decrementoThread.start();
		
	}

}
