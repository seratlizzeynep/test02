package arraylistornek;

import java.util.ArrayList;
import java.util.Scanner;

public class KisiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        
	     //   ArrayList<Integer>numaralar = new ArrayList<>();
	        ArrayList<String> isimler = new ArrayList<>();
	        
	        
	        System.out.println("Kaç isim girilecek?");
	        int isimSayi = scanner.nextInt();
	        scanner.nextLine();  
	        
	        
	        for (int i = 0; i < isimSayi; i++) {
	            System.out.println("Bir isim girin: ");
	            String isim = scanner.nextLine();
	            isimler.add(isim);
	        }
	        
	        
	        System.out.println("Eklenen isimler:");
	        for (String isim : isimler) {
	            System.out.println(isim);
	        }
	        
	   
	        System.out.println("Silmek istediğiniz ismi girin:");
	        String silinecekIsim = scanner.nextLine();
	        if (isimler.remove(silinecekIsim)) {
	            System.out.println(silinecekIsim + " listeden silindi.");
	        } else {
	            System.out.println(silinecekIsim + " listede bulunamadı.");
	        }
	
	       
	    
	       System.out.println("Güncel isim listesi:");
	        for (String isim : isimler) {
	            System.out.println(isim);
	        }
	}
}


