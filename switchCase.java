package github;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bedenler = 6;
		switch (bedenler) {
		case 1:
			System.out.println("Bedeniniz  : XS " );
			
			break;

		case 2 : 
			System.out.println("Bedeniniz : S ");
			break;
			case 3:
				System.out.println("Bedeniniz: M ");

				break;
			case 4:
				System.out.println("Bedeniniz : L");
				break;
			case 5 :
				System.out.println("Bedeniniz : XL");
				break;
				default:
					System.out.println("Size uygun bedenimiz yok");
				
		}
}
}