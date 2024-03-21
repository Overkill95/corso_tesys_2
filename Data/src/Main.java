import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		/*
		 
		Data dataDefault = new Data();
		Data data= new Data(01,10,2024);
		System.out.println(dataDefault);
		System.out.println(data);
		
		
		System.out.println(dataDefault.equals(data));
		
		Data d2 = data.clone();
		
		System.out.println(d2);
		
		
		
		
		  Data d3;
		  try {
		    
		    d3= data.clone();
		    
		    System.out.println("d3: " + d3);
		  } catch (CloneNotSupportedException e) {
		    
		    e.printStackTrace();
		  }
		  
		  */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vuoi creare la prima data?");
		String risposta = scanner.nextLine();
		
		  Data[] data = new Data[2];
		
		if(risposta.equals("y")) {
			 for (int i = 0; i < 2; i++) {
				 		
				 while (true) {
		                    try {
		                        System.out.println("Aggiungi il numero del giorno");
		                        int giorno = scanner.nextInt();

		                        System.out.println("Aggiungi il numero del mese");
		                        int mese = scanner.nextInt();

		                        System.out.println("Aggiungi l'anno:");
		                        int anno = scanner.nextInt();

		                        data[i] = new Data(giorno, mese, anno);

		                        System.out.println("La " + (i + 1) + " data è " + data[i]);
		                  
		                        break;
		                        
		                    } catch (IllegalArgumentException e) {
		                        System.out.println("Attenzione! Inserisci data valida");
		                    }
		                }
			        
			        }
			  
			 System.out.println(Arrays.toString(data));
			
			LocalDate data1 = LocalDate.of(data[0].getAnno(), data[0].getMese(), data[0].getGiorno());
			LocalDate data2 = LocalDate.of(data[1].getAnno(), data[1].getMese(), data[1].getGiorno());
			
			
			if (data1.isBefore(data2)) {
			    System.out.println("data1 è precedente a data2");
			} 
			
			else if (data1.isAfter(data2)) {
			    System.out.println("data1 è successiva a data2");
			} 
			else {
			    System.out.println("Le due date sono uguali");
			}
			 
		}
		
		
		
		}

//	 private static void restart(String[] strArr) throws CloneNotSupportedException
//	    {
//	        System.out.println("RESTART...");
//	        main(strArr);
//	    }

	

}
