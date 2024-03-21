package com.data.business;

import java.time.LocalDate;
import java.util.Calendar;

public class Data implements Cloneable, Confrontabile {
	
	private int giorno;
	private int mese;
	private int anno;
	
	 
	
	public Data(int giorno,int mese,int anno) {
		
		if (anno < 0) {
			throw new IllegalArgumentException("Anno non valido");
		    }
		    if (mese < 1 || mese > 12) {
		    	throw new IllegalArgumentException("Il mese deve essere compreso tra 1 e 12");
		    }
		    if (giorno < 1 || giorno > 31 || giorno > giorniDelMese(mese, anno)) {
		    	throw new IllegalArgumentException("Il giorno non è valido");
		    }
		    
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		
	}
	
	public Data() {
		
		Calendar c = Calendar.getInstance(); // DATA ODIERNA
	    
		this.giorno = c.get(Calendar.DATE); // 08 è un ottale
		this.mese = c.get(Calendar.MONTH) +1;
		this.anno = c.get(Calendar.YEAR);
		
	}
	
	
	public static Data oggi() {
		
//		LocalDate dataOdierna = LocalDate.now();
//		return new Data(dataOdierna.getDayOfMonth(), dataOdierna.getMonthValue(), dataOdierna.getYear());
		 
		LocalDate dataOdierna = LocalDate.now();
		int giorno = dataOdierna.getDayOfMonth();
		int mese = dataOdierna.getMonthValue();
		int anno = dataOdierna.getYear();

		return new Data(giorno, mese, anno);
	
	}
	
	public int giorniDelMese(int mese, int anno) {
	    switch (mese) {
	        case 1: 
	        case 3: 
	        case 5: 
	        case 7: 
	        case 8: 
	        case 10: 
	        case 12: 
	            return 31;
	        case 4: 
	        case 6: 
	        case 9: 
	        case 11: 
	            return 30;
	        case 2: 
	            if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
	                return 29; 
	            } else {
	                return 28; 
	            }
	        default:
	            throw new IllegalArgumentException("Mese non valido");
	    }
	}


	
	public int getGiorno() {
		return giorno;
	}
	
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public String toString() {
		    return giorno + "/" + mese + "/" + anno;
	}

	
	public Data clone() throws CloneNotSupportedException {
		 
		  Data copia = (Data) super.clone();
		  copia.giorno = this.giorno;
		  copia.mese = this.mese;
		  copia.anno = this.anno;
		  return copia;
	}

	
	
	public boolean equals(Object obj) {
		    
		    if (this == obj) {
		      return true;
		    }
		  
		    if (obj instanceof Data) {
		      Data d = (Data) obj;
		      return this.giorno == d.giorno && this.mese == d.mese && this.anno == d.anno;
		    }
		    return false;
	}
	

	@Override
	public boolean maggiore(Data data1, Data data2) {
	
		    if (!paritetico(data1, data2)) {
		    	 if (data1.anno > data2.anno || 
		        (data1.anno == data2.anno && data1.mese > data2.mese) || 
		        (data1.anno == data2.anno && data1.mese == data2.mese && data1.giorno > data2.giorno)) {
		        System.out.println("La prima data è più grande della seconda.");
		        return true;
		    } else if (data1.anno < data2.anno || 
		               (data1.anno == data2.anno && data1.mese < data2.mese) || 
		               (data1.anno == data2.anno && data1.mese == data2.mese && data1.giorno < data2.giorno)) {
		        System.out.println("La seconda data è più grande della prima.");
		        return false;
		    }
		    	
		    }
		    return false;
	}
	
	
	
	public  Data maggioreData(Data data1, Data data2) {
	    
	    if (paritetico(data1, data2)) {
	        System.out.println("Le date sono parietiche.");
	        
	        return null;
	    }

	  
	    if (data1.anno > data2.anno || 
	        (data1.anno == data2.anno && data1.mese > data2.mese) || 
	        (data1.anno == data2.anno && data1.mese == data2.mese && data1.giorno > data2.giorno)) {
	        System.out.println("La prima data è più grande della seconda.");
	        return data1;
	    } else if (data1.anno < data2.anno || 
	               (data1.anno == data2.anno && data1.mese < data2.mese) || 
	               (data1.anno == data2.anno && data1.mese == data2.mese && data1.giorno < data2.giorno)) {
	        System.out.println("La seconda data è più grande della prima.");
	        return data2;
	    } else {
	        System.out.println("Le date sono uguali.");
	        return null;
	    }
	}



	
	

	@Override
	public boolean paritetico(Data data1, Data data2) {
		// TODO Auto-generated method stub
		if(data1.anno == data2.anno && data1.giorno == data2.giorno && data1.mese == data2.mese) {
		System.out.println("Le due date sono uguali");
		return true;
		}
		return false;
	}
	
	
	
	  public void maggioreTre(Data data1, Data data2, Data data3) {
	  
		  boolean data1MaggioreDiData2 = maggiore(data1, data2); 
		  boolean data2MaggioreDiData1 = maggiore(data2, data1);
		  boolean data1MaggioreDiData3 = maggiore(data1, data3); 
		  boolean data3MaggioreDiData1 = maggiore(data3, data1);
		  boolean data2MaggioreDiData3 = maggiore(data2, data3); 
		  boolean data3MaggioreDiData2 = maggiore(data3, data2);
	  
	  
		  if (data1MaggioreDiData2 && data1MaggioreDiData3) {
			  System.out.println("data1 è la data maggiore"); } 
		  else if (data2MaggioreDiData1 && data2MaggioreDiData3) {
			  System.out.println("data2 è la data maggiore"); } 
		  else if (data3MaggioreDiData1 && data3MaggioreDiData2) {
			  System.out.println("data3 è la data maggiore"); } 
		  else {
			  System.out.println("due date o tutte e tre sono uguali"); 
			  } 
	}
	 
	

	public void incrementaDiUnGiorno() {
		int maxDay = giorniInUnMese(mese,anno);
		if(giorno < maxDay) {
			giorno++;
		}
		else {
			giorno = 1;
			if(mese < 12) {
				mese++;
			}else {
				mese = 1;
				anno++;
			}
		}
	}
	
	public void decrementaDiUnGiorno() {
		int mesePrecedente = giorniInUnMese(mese-1,anno);
		
		if(giorno > 1) {
			giorno--;
		}
		else {
			giorno = mesePrecedente;
			if( mese > 1) {
				mese--;
			}
			else {
				mese = 12;
				int giorniMeseDicembre = giorniInUnMese(mese,anno);
				anno--;
				giorno= giorniMeseDicembre;
			}
			
		}
	}
	
	
	
	public boolean annoBisestile (int anno) {
		return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) ;
	}
	
	
	public int giorniInUnMese (int mese,int anno) {
		switch (mese) {
		 case 1: 
	        case 3: 
	        case 5: 
	        case 7: 
	        case 8: 
	        case 10: 
	        case 12: 
	            return 31;
	        case 4: 
	        case 6: 
	        case 9: 
	        case 11: 
	            return 30;
	        default:
                if (annoBisestile(anno)) {
                    return 29;
                } else {
                    return 28;
                }
			}
	}
	
	
	public void aumentaGiorniDi(int giorniDaIncrementare) {
		
		for(int i = 0; i < giorniDaIncrementare; i++) {
			int maxDay = giorniInUnMese(mese,anno);
			
			 if (annoBisestile(anno) && mese == 2) {
		            maxDay = 29; 
		        }
			
			if(giorno < maxDay) {
				giorno = giorno + 1;
			}
			else {
				
				if(mese < 12) {
					mese++;
					giorno = 1;
				}else {
					mese = 1;
					anno++;
					giorno = 1;
				}
			}
		}
		
	}
	
	public void aumentaGiorniDi(int giorniDaIncrementare, Data data) {
		
		for(int i = 0; i < giorniDaIncrementare; i++) {
				data.incrementaDiUnGiorno();
			}
	}
	
	
	public void diminuisciGiorniDi(int giorniDaDiminuire) {
		
		for(int i = 0; i < giorniDaDiminuire; i++) {
			int maxDay = giorniInUnMese(mese,anno);
		 
		if (annoBisestile(anno) && mese == 2) {
	            maxDay = 29; 
	        }
		 
			if(giorno > 1) {
				giorno--;
			}
			else {
				if(mese > 1) {
					mese--;	
					int maxDay2 = giorniInUnMese(mese,anno);
					giorno = maxDay2;
				}
				else {
					mese = 12;
					anno--;
					giorno = 31;
				}
			}
		}
	}
	
	
	public void diminuisciGiorniDi(int giorniDaDiminuire, Data data) {
		
		for(int i = 0; i < giorniDaDiminuire; i++) {
				data.decrementaDiUnGiorno();
			}
	}

	

	
	
		

}