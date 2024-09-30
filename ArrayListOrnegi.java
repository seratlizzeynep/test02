package github;

import java.util.ArrayList;

public class ArrayListOrnegi {

	public static void main(String[] args) {
		
	
		ArrayList<Integer> sayilar = new ArrayList<>();	 // int deger de string deger de kabul eder.
		
	 sayilar.add(1);
	 sayilar.add(2);
	 
	 System.out.println("Dizide " + sayilar.size() + " eleman vardir.");
	 System.out.println("Birinci sayi: " + sayilar.get(0));
	 System.out.println("İkinci sayi: " + sayilar.get(1));
	 sayilar.set(0, 7);
	 System.out.println("Birinci sayinin yeni degeri: " + sayilar.get(0));
	 // sayilar.remove(0); 1i siler. Artik birinci eleman 2 olur.
	 // sayilar.clear(); tum elemanlari siler.
	 
	
	 System.err.println("----------------------------------------------");
	   ArrayList<String> sehirler = new ArrayList<>();
	   sehirler.add("Ankara");
	   sehirler.add("Erzurum");
	   sehirler.add("İzmir");
	   
	     System.out.println("Dizide " + sehirler.size() + " eleman vardir.");
		 System.out.println("Birinci sehir: " + sehirler.get(0));
		 System.out.println("İkinci sehir: " + sehirler.get(1));
		 System.out.println("Üçüncü sehir: " + sehirler.get(2));
		 
		 for (String i : sehirler ) {
			System.err.println(i);
		}
	}

	

}
