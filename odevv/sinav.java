package odevv;

import java.util.Random;

public class sinav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		int islemsayi = rnd.nextInt(10);
		int islemtur = rnd.nextInt(2);
		
		
		faktoriyel faktoriyel = new faktoriyel();
		faktoriyel fonksiyon = new faktoriyel();
		
		switch (islemtur) {
		case 0:
			for (int i = 0; i < islemsayi; i++) {
				int sayi1=rnd.nextInt(10);
				int sonuc = faktoriyel.faktoriyelalma(sayi1);
				System.out.println("faktoriyelsonucu=="+sonuc);

			}

			break;

		case 1:
			int sayi2=rnd.nextInt(10);
			int sonuc = fonksiyon.fonksiyonalma(sayi2);
			System.out.println("fonksiyon==" + sonuc);

			break;

		default:
			break;
		}

	}

}
