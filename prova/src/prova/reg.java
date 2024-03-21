package prova;

import java.util.Arrays;

public class reg {
	
	static int  N = 8;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scacchiera = new int [N][N];
		if(!posizionamentoRegina(scacchiera, 0)) {
			System.out.println("Non esiste una soluzione");
		}

	}
	
	public static boolean posizionamentoRegina(int[][] scacchiera,int col) {
		
		//controllo se tutte le regine sono state messe
		if(col == N) {
			for (int[] row : scacchiera)
				System.out.println(Arrays.toString(row));
				System.out.println();
				return true;
		}
		
		for(int i = 0; i < N; i++) {
			if(reginaInSalvo(scacchiera,i,col)) {
				scacchiera[i][col]= 1; //metto la regina
				if (posizionamentoRegina(scacchiera, col + 1))
					return true;
				
				scacchiera[i][col] = 0; //backtracking 
			}
			
		}
		return false;
	}
	
	
	public static boolean reginaInSalvo(int[][] scacchiera, int row, int col) {
		
		//controllo colonna
		for (int j = 0; j < col; j++) 
			if (scacchiera[row][j] == 1)
				return false;
		
		//controllo diagonali
		for (int x = row, y = col; x < N && y >= 0;
				x++, y--)
				if (scacchiera[x][y] == 1)
					return false;
		
		for (int x = row, y = col; x >= 0 && y >= 0;
				x--, y--)
				if (scacchiera[x][y] == 1)
					return false;
		
		return true;
	}
	

}
