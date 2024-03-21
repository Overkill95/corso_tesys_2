package prova;

public class WhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i = 0;
		while( i <= 10 ) {
			System.out.println(i);
			i++;
		}
		
		
		int somma = 0;
	
		
		while ( i <= 100) {
			somma += i;
			i++;
		}
		System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
		
		int num = 1;
		while ( num <= 20) {
			if(num % 2 == 0) {
				System.out.println("il numero " + num + " è paro");
			}
		num++;
		}
		
		int tb5= 1;
		while (tb5 <= 10) {
			int tabellina = tb5*5;
			System.out.println(tabellina);
			tb5++;
		}
		*/
		
		int [] arr = {1,2,3,4};
		
		int i = 0;
		
		do {
			System.out.println(arr[i]);
			i++;
		}
		while (i < arr.length); 
		
		int somma = 0;
		int j = 1;
		
		
		do {
			somma += j;
		
			j++;
		}
		while(j <= 50);
			System.out.println(somma);
			
			
		
		int y = 10;	
		
		do {
			if( y % 2 == 0) {
				System.out.println(y);
			}
		y--;
		}
		while(y > 0);
	}


}
