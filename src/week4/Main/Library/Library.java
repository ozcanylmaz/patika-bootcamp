package week4.Main.Library;

import week4.Main.book.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        //  Başlangıç kitapları
        books.add(new Book("Suç ve Ceza", "Fyodor Dostoyevski"));
        books.add(new Book("Sefiller", "Victor Hugo"));
        books.add(new Book("Küçük Prens", "Antoine de Saint-Exupéry"));
        books.add(new Book("Simyacı", "Paulo Coelho"));
        books.add(new Book("Harry Potter ve Felsefe Taşı", "J.K. Rowling"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Hayvan Çiftliği", "George Orwell"));
        books.add(new Book("Yüzüklerin Efendisi", "J.R.R. Tolkien"));
        books.add(new Book("Sherlock Holmes", "Arthur Conan Doyle"));
        books.add(new Book("Nutuk", "Mustafa Kemal Atatürk"));
    }

    public void addBook(Book scanner) {
        System.out.print("Kitap adı: ");
        String title = scanner.nextLine();
        System.out.print("Yazar adı: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println(" Kitap eklendi.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println(" Kütüphane boş.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void searchBook(Scanner scanner) {
        System.out.print("Aranacak kitap adı: ");
        String searchTitle = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTitle)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Kitap bulunamadı.");
        }
    }

    public void borrowBook(Scanner scanner) {
        System.out.print("Ödünç alınacak kitap adı: ");
        String title = scanner.nextLine().trim();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println(" Kitap ödünç alındı.");
                } else {
                    System.out.println(" Bu kitap zaten ödünç alınmış.");
                }
                return;
            }
        }
        System.out.println(" Kitap bulunamadı.");
    }

    public void returnBook(Scanner scanner) {
        System.out.print("İade edilecek kitap adı: ");
        String title = scanner.nextLine().trim();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println(" Kitap iade edildi.");
                } else {
                    System.out.println(" Bu kitap zaten kütüphanede.");
                }
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }
}