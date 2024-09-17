package github;

public class asalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sayi = 25;
 int kalan = sayi%2;

 boolean asalMi = true;
 if (sayi==1) {
	 System.out.println("sayi asal degildir");
	 return;
 }
 if (sayi<1) {
	 System.out.println("geçersiz sayı");
	 
	}
 for (int i=2; i< sayi ; i++) {
	 if (sayi%i==0) {
		 asalMi = false;
		 
		}
}
 if (asalMi) {
	 System.out.println("sayi asaldir.");
	 
 }else {
	 System.out.println("sayi asal degildir.");
 }
 }
}