package prova;

import java.util.Scanner;

public class Matrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("qual'è il valore che vui dare a m?");
		int m = scanner.nextInt();
		
		System.out.println("il valore di n?");
		int n = scanner.nextInt();
		
		System.out.println("n = " + n + " " + "m = " + m);
		
		int [][] arr = new int [n][m];
		
		System.out.println(arr.length);
		
		
		for(int i = 0; i < arr.length; i++) {
			 for(int j=0; j< arr[i].length; j++) {
				 
				 if((i + j) % 2 == 0) 
					arr[i][j] = 1;
				 else
					 arr[i][j] = 0;
			     
			     System.out.print(arr[i][j]+" ");
			      }
			 System.out.println("");	
		}
		
		  
	}

}
