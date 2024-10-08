package github;

public class tryCatchFinally {

	
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3};

	        try {
	            System.out.println( + numbers[3]); 
	        } catch (Exception exception) { // hata olunca bu blok calısır
	           
	            System.out.println("Hata olustu!");
	        } finally {
	            // bu blok her zaman çalışır (hata olsa da olmasa da)
	            System.out.println("Finally bloğu çalıştı.");
	        }

	       
	    }
	}

