package prova;

public class Regina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 8;
		
		int[][] scacchiera = new int[N][N];
		
		for(int i = 0; i < scacchiera.length; i++) {
			for(int j = 0; j < scacchiera[i].length; j++) {
				if( i >= 0  && j < 1) {
					scacchiera[i][j] = 1;
				}
				else {
					scacchiera[i][j] = 0;
				}
				System.out.print(scacchiera[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("scacchiera di partenza");
	
		for(int i = 0; i < scacchiera.length; i++) {
			for(int j = 0; j < scacchiera.length - 1; j++) {
				if(scacchiera[i][j] == 1 ) {
					
					
					scacchiera[i][j+1] = 1; 
					scacchiera[i][j] = 0;
					
					
				}
				
				
				System.out.print(scacchiera[i][j]+" ");
			}
			System.out.println("");
		}
	
	
		
	}
	
	
final boolean controlloCaselle (int [][] combinazione, int x, int j){
		
		if (combinazione[x+1][j] == 0 ) 
			return true;
	
			return false;
			}
}
