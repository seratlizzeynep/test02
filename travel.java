package travel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int istanbulPrice = 1300;
         int antalyaPrice = 1600;
        int bodrumPrice = 2000;
      int berlinPrice = 20000;
     int parisPrice = 15000;
      
        while (true) {
            System.out.print("Enter your current balance: ");
            int balance = scanner.nextInt();
            scanner.nextLine(); 

            List<String> availableCities = new ArrayList<>();

            
            if (balance >= berlinPrice) {
                availableCities.add("Berlin");
            }
            if (balance >= parisPrice) {
                availableCities.add("Paris");
            }
            if (balance >= bodrumPrice) {
                availableCities.add("Bodrum");
            }
            if (balance >= antalyaPrice) {
                availableCities.add("Antalya");
            }
            if (balance >= istanbulPrice) {
                availableCities.add("Istanbul");
            }

            
            if (availableCities.isEmpty()) {
                System.out.println("No place to visit");
            } else {
                System.out.print("Places you can visit are: ");
                System.out.println( availableCities);
                
                
                System.out.print("Which place you choose?");
                String chosenCity = scanner.nextLine();

                
                int newprice = 0;
                switch (chosenCity) {
                    case "istanbul":
                        newprice = istanbulPrice;
                        break;
                    case "antalya":
                        newprice = antalyaPrice;
                        break;
                    case "bodrum":
                        newprice = bodrumPrice;
                        break;
                    case "paris":
                        newprice = parisPrice;
                        break;
                    case "berlin":
                        newprice = berlinPrice;
                        break;
                    
                }

                
                balance -= newprice;
                System.out.println("Your new balance is: "+ balance + " TL. Have a nice flight!");
            }
        }
    }
}
