package week4.Main;

import week4.Main.Library.Library;
import week4.Main.book.Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;

        System.out.println("\nKütüphane Yönetim Sistemine Hoş Geldiniz!");
        do {
            int choice = 0;

            System.out.println("Lütfen bir seçenek seçin:");
            System.out.println("1. Yeni bir kitap ekleyin");
            System.out.println("2. Tüm kitapları görüntüle");
            System.out.println("3. Başlığa göre kitap arayın");
            System.out.println("4. Bir kitap ödünç alın");
            System.out.println("5. Bir kitabı iade edin");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminizi girin: ");
            try {
                choice = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Lütfen Tam Sayı Giriniz.");
            }
            scanner.nextLine(); // buffer temizleme

            switch (choice) {
                case 1:
                    System.out.print("Kitap başlığı: ");
                    String title = scanner.nextLine();
                    System.out.print("Yazar adı: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    library.searchBook(scanner);
                    break;
                case 4:
                    library.borrowBook(scanner);
                    break;
                case 5:
                    library.returnBook(scanner);
                    break;
                case 6:
                    System.out.println("Sistemden çıkılıyor...");
                    exit = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
                    break;
            }
        } while (exit);
    }
}