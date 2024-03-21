package prova;

public class prova3 {
    
    public static final int N = 8;
    public static int[] regine = new int[N];
    public static int soluzioni = 0;

    
    public static void main(String[] args) {
        
        cerca(0);
        
        System.out.println("Soluzioni trovate: " + soluzioni);
    }

    
    public static void cerca(int riga) {
        
        if (riga == N) {
            soluzioni++;
            stampa();
            return;
        }
       
        for (int colonna = 0; colonna < N; colonna++) {
            
            if (libera(riga, colonna)) {
                regine[riga] = colonna;
                
                cerca(riga + 1);
               
                regine[riga] = -1;
            }
        }
    }

    
    public static boolean libera(int riga, int colonna) {
        
        for (int i = 0; i < riga; i++) {
        	
        	if (regine[i] == colonna) {
                return false;
            }
           
            if (Math.abs(i - riga) == Math.abs(regine[i] - colonna)) {
                return false;
            }
        }
        
        return true;
    }

    
    public static void stampa() {
        System.out.println("Soluzione " + soluzioni + ":");
       
        for (int i = 0; i < N; i++) {
          
            for (int j = 0; j < N; j++) {
               
                if (regine[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
          
            System.out.println();
        }
        
        System.out.println();
    }
}
