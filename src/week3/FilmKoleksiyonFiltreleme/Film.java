package week3.FilmKoleksiyonFiltreleme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Film {
    String ad;
    int yayinYili;
    String tur;
    double imdbPuani;


    public Film(String inception, int i, String bilimKurgu, double v) {

    }

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Film> filmler = new ArrayList<>();

            // Film nesneleri oluştur
            filmler.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
            filmler.add(new Film("The Godfather", 1972, "Suç", 9.2));
            filmler.add(new Film("Interstellar", 2014, "Bilim Kurgu", 8.6));
            filmler.add(new Film("Parasite", 2019, "Drama", 8.6));
            filmler.add(new Film("Joker", 2019, "Suç", 8.4));

            // IMDb puanına göre büyükten küçüğe sırala
            System.out.println(" IMDb puanına göre sıralama:");
            filmler.sort((f1, f2) -> Double.compare(f2.imdbPuani, f1.imdbPuani));
            filmler.forEach(System.out::println);

            // Yayın yılına göre küçükten büyüğe sırala
            System.out.println("\n Yayın yılına göre sıralama:");
            filmler.sort(Comparator.comparingInt(f -> f.yayinYili));
            filmler.forEach(System.out::println);

            // Kullanıcıdan film türü al
            System.out.print("\n Filtrelemek istediğiniz film türünü girin: ");
            String tur = scanner.nextLine();

            filmTureGoreFiltrele(filmler, tur);
        }

        // Belirli türe göre filtreleme metodu
        public static void filmTureGoreFiltrele(List<Film> filmler, String tur) {
            System.out.println("\n " + tur + " türündeki filmler:");
            boolean bulundu = false;
            for (Film film : filmler) {
                if (film.tur.equalsIgnoreCase(tur)) {
                    System.out.println(film);
                    bulundu = true;
                }
            }
            if (!bulundu) {
                System.out.println("Bu türe ait film bulunamadı.");
            }
        }
    }
}
