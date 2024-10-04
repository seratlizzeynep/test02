package coursera01;

public class odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double[] sayilar = new double[5];
	        

	        double min = sayilar[0];
	        double max = sayilar[0];
	        double toplam = 0;
	       
	        for (int i = 0; i < sayilar.length; i++) {
	            sayilar[i] = Math.random();
	        }

	        for (double sayi : sayilar) {
	            toplam = toplam + sayi;
	            min = Math.min(min, sayi);
	            max = Math.max(max, sayi);
	        }

	        
	        double ortalama = toplam / sayilar.length;

	      
	        System.out.println("Rastgele sayılar:");
	        for (double sayi : sayilar) {
	            System.out.println(sayi);
	        }

	        System.out.println("Orta sayi: " + ortalama);
	        System.out.println("Minimum sayi : " + min);
	        System.out.println("Maksimum sayi: " + max);
	    }
	
	}


