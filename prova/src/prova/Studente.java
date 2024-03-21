package prova;

public class Studente {
	int matricola;
	private String nome = "marco";
	
	public Studente(int matricola){
		this.matricola = matricola;
	}
	
	public void matricolaStudente() {
		System.out.println("la matricola è " + this.matricola);
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	
	public String toString () {
		String stringa = this.nome + "\n" +  this.matricola;
		return stringa;
	}

}
