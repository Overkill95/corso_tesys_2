package prova;

public class Moto extends Veicolo {
 
	int cilindrata;
	
	public Moto(String marca, int cilindrata) {
		super(marca);
		this.cilindrata = cilindrata;
	}
	
	public void mostraCilindrata() {
		System.out.println(cilindrata + "cc");
	}



public static void main(String[] args) {
    Moto moto = new Moto("Honda", 500);
    
    moto.mostraCilindrata();
	}

}
