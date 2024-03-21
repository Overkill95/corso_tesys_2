package prova;

public class Funzioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1 = 10;
		int l2 = 20;
		System.out.println(calcolaAreaRettangolo(10,20));
		
		int numero = 10;
		
		System.out.println(numeroPari(numero));
		
	
	}
	public static int calcolaAreaRettangolo (int x,int y) {
		int area = x*y;
		return area;
	}
	
	public static boolean numeroPari(int x) {
		boolean pari = x % 2 == 0;
		return pari;
	}
}
