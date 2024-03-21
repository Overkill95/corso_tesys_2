package prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		boolean compreso = x >= 10 && x <= 22;
	
		System.out.println("è compreso " + compreso);
		
		
		int anno=2023;
		boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0;
		
		System.out.println("l' anno " + anno + "è bisestile? " + bisestile);
		
		
		int numero = 30;
		boolean pari = (numero % 2 == 0 && numero % 3 == 0);
		
		
		char carattere = 't';
		boolean consonanteMinuscola = (carattere >= 'a' && carattere <= 'z' && carattere != 'a' && carattere != 'e' && carattere != 'i' && carattere != 'o' && carattere !='u');
		System.out.println("il carattere " + "'" + carattere + "'" + " è una consonante?" + " " + consonanteMinuscola);
		
		
		String testo = "ciao";
		System.out.println(testo.length());
		
		System.out.println(testo.toUpperCase());
		
		String frase = "tutto bene?";
		String b = "e";
		boolean contiene = frase.contains(b);
		System.out.println(contiene);
		
		
		int numeroDaVerificare = -1;
		
		if(numeroDaVerificare > 0) {
			System.out.println("il numero è positivo");
		}
		else if(numeroDaVerificare < 0) {
			System.out.println("il numero è negativo");
		}
		else {
			System.out.println("il numero è 0");
		}
		
		char carattere2 = 'a';
		if (Character.isUpperCase(carattere2)) {
			System.out.println("il carattere è maiuscolo");
		}
		else {
			System.out.println("il carattere è minuscolo");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		
		int numeroDaInserire = scanner.nextInt();
		
		String risultato = (numeroDaInserire % 2 == 0) ? "il numero è pari" : "il numero è dispari";
		System.out.println(risultato);
		
	}

}
