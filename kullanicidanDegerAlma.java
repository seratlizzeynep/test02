package github;

import java.util.Scanner;

public class kullanicidanDegerAlma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz:");
		
		String isim = scanner.nextLine();
		
		System.err.println("Selamlar , " + isim);
	}

}
