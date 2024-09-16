package github;

public class whileDizininToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] sayilar = {20.5,30.6,80.9,10.2};
		double toplam =0;
		
		int i=0;
		
		while (i<sayilar.length) {
			toplam = sayilar [i]+toplam;
			i++;
		}
		
		System.out.println("Dizideki elemanlarin toplami :" + toplam);
	}

}
