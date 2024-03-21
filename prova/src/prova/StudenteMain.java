package prova;

public class StudenteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studente studente1 = new Studente(3456);
		
		studente1.matricolaStudente();
		
		System.out.println(studente1.getNome());
		
		studente1.setNome("Daniel");
		
		System.out.println(studente1.toString());

	}

}
