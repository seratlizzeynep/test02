package coursera01;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    
		     Scanner scanner = new Scanner(System.in);

		        System.out.print("Birinci sayıyı girin: ");
		        int a = scanner.nextInt();

		        System.out.print("İkinci sayıyı girin: ");
		        int b = scanner.nextInt();

		        System.out.print("Üçüncü sayıyı girin: ");
		        int c = scanner.nextInt();

		        
		        int min = Math.min(a, Math.min(b, c));
		        int max = Math.max(a, Math.max(b, c));

		        
		        int orta = a + b + c - min - max;

		        
		        System.out.println("Sayılar artan sırayla: " + min + " " + orta + " " + max);
		    }
		}




