package github;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CheckedException {
	
	
	    public static void main(String[] args) {
	        String file = "ornekDosya";

	        // Dosya okuma işlemi
	        try {
	            readFile(file);
	        } catch (IOException e) {
	            System.out.println("Dosya okunurken bir hata oluştu.");
	            e.printStackTrace();//bir istisna (exception) yakalandığında, 
                          // ayrıntılarını ve hata yığınını (stack trace) konsola yazdırmak için kullanılır
	      
	        }
	    }

	    public static void readFile(String file) throws IOException {
	        BufferedReader reader = null;

	        try {
	            reader = new BufferedReader(new FileReader(file));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    System.out.println(" Dosya kapatılırken bir hata oluştu.");
	                }
	            }
	        }
	    }
}