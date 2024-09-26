package github;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ilk sayiyi giriniz:");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen ikinci sayiyi giriniz:");
		int sayi2 = scanner.nextInt();
		System.out.println("Yapilacak işlemi (+,-,*,/)seçiniz: ");
		char islem = scanner.next().charAt(0);
		
		int sonuc = 0;
		switch (islem) {
		case '+':
			sonuc= sayi1 + sayi2;
			break;

		case '-':
			
				sonuc = sayi1 - sayi2;
			
			break;
		
		case '*':
			sonuc= sayi1 * sayi2;
			break;
			
		case '/':
			if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Gecersiz sayi.");
                return;
            }
			
			break;
		}
		System.out.println(  "Sonuc = " + sonuc);
	}

}
