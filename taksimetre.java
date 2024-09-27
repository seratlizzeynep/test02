package taksimetre;

import java.util.Scanner;
public class taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double baslangicUcreti = 25.0;          
        double kmBasiUcret = 12.24;         
        double minimumUcret = 40.0;      
        
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç km gidiliyor: ");
        double uzaklik = scanner.nextDouble();
        
       
        double toplamUcret = baslangicUcreti + (uzaklik * kmBasiUcret);
        
      
        if (toplamUcret < minimumUcret) {
            toplamUcret = minimumUcret;
        }
        
        
        System.out.println("Toplam ücret: " + toplamUcret );
        
      
    }

	}


