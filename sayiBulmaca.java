package github;

public class sayiBulmaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayiBulma();
	}
public static void sayiBulma() {
	
	int [] sayilar = new int [] {1,2,5,7,9,0};
	
	int aranacakSayi = 6;
	boolean varMi=false;
	
	for (int sayi : sayilar) {
		
		if (sayi==aranacakSayi) {
			
			varMi=true;
			break;
		}
	}
	
	if (varMi) {
		System.out.println("Sayi mevcuttur.");
	}else {
		System.out.println("Sayi mevcut degildir.");
	}
}
}
