package github;

public class enbuyukSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 100;
		int sayi2 = 15;
		int sayi3 = 16;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {

		enBuyuk = sayi2;

	}
		if (enBuyuk < sayi3) {
			
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayi: " +  enBuyuk);

}
}