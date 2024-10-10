package lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Kitabın adını girin: ");
        String name = scanner.nextLine();

        System.out.print("Çıkış yılını girin: ");
        int releaseDate = scanner.nextInt();

        System.out.print("Fiyatı girin: ");
        double price = scanner.nextDouble();

        
        Book myBook = new Book(releaseDate, name, price);

        
        System.out.println("Kitap oluşturuldu: " + myBook.toString());

       
        System.out.println("50 çıkarıldıktan sonra yeni fiyat: " + myBook.deductPrice());

        
        System.out.print("Yeni kitap adını girin: ");
        scanner.nextLine();  
        String newName = scanner.nextLine();
        myBook.changeName(newName);

        
        System.out.println("Güncellenmiş kitap: " + myBook.toString());

       
    }
}
