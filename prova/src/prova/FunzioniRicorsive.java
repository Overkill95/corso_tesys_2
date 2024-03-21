package prova;

public class FunzioniRicorsive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 11;
		
		System.out.println(n + "! = " + fattoriale(n));

	}
	   public static int fattoriale(int n) {
	        
	        if (n == 0)
	           return 1;
	        else
	        {   
				int result = n * fattoriale(n - 1);
				return result;
			    }
	    }
	
	}


