package odevv;

public class faktoriyel {

	int faktoriyelalma(int sayi) {
		int sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc = sonuc * i;

		}
		return sonuc;

        }
    
	int fonksiyonalma(int sayi) {
		int sonuc = 0;
		sonuc = (sayi*sayi*sayi)+((sayi-3)*(sayi-3));
		
		return sonuc;

        }
	
	
	}
	


