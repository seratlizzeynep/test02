package deneme;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapOrnegi {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       HashMap<Integer, String> ogrenciler = new HashMap<>();
       
       System.out.println("Kaç öğrenci gireceksiniz?");
       int ogrenciSayisi = scanner.nextInt();
       scanner.nextLine();  
       
       for (int i = 0; i < ogrenciSayisi; i++) {
           System.out.println("Öğrencinin ismini girin: ");
           String isim = scanner.nextLine();
           System.out.println(isim + " adlı öğrencinin notunu girin: ");
           int not = scanner.nextInt();
           scanner.nextLine();  
            
           ogrenciler.put(not, isim);
           
           }
           
       System.out.println("Öğrenciler ve notları:");
       for (Integer isim : ogrenciler.keySet()) {
           System.out.println(isim + " : " + ogrenciler.get(isim));
       }
       
       
       
       
	}
}