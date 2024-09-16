package github;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj1 = "Merhaba";
		String mesaj2 = ",";
		String mesaj3 = "bugün";
		String mesaj4 = "hava";
		String mesaj5 = "çok";
		String mesaj6 = "güzel";
		String [] mesajlar = {mesaj1,mesaj2,mesaj3,mesaj4,mesaj5,mesaj6};
		
		int i = 0;
		String sonMesaj = " ";
		
		do {
			
			sonMesaj = sonMesaj+ " " + mesajlar[i];
			i++;
		} while (i< mesajlar.length);
		System.out.println(sonMesaj);
	}


}
