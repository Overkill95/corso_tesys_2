package prova;

import java.util.Arrays;

public class Prova2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lucchetto = {0,0,0,0};
		
		for(int i = 0; i<=9; i++ ) {
			
			lucchetto[0] = i;
			
			for(int j = 0; j <= 9; j++) {
				
				lucchetto[1] = j;
				
				for(int k = 0; k <= 9; k++) {
					
					lucchetto[2] = k;
					
					for(int y = 0; y <= 9; y++) {
						
						lucchetto[3] = y;
						
					if(isCombinazioneTrue(lucchetto)) {
					System.out.println("la combinazione giusta è" +  lucchetto[0] + lucchetto[1] + lucchetto[2] + lucchetto[3]);
						}
					}
				}
			}
		}
	}
	
	public static boolean isCombinazioneTrue (int[] combinazioni) {
		int[] combinazioneGiusta = {2,3,5,8};
		return Arrays.equals(combinazioneGiusta, combinazioni);
	}

}
