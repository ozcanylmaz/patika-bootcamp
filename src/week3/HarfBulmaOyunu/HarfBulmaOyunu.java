package week3.HarfBulmaOyunu;

import java.util.ArrayList;

import java.util.Scanner;

    public class HarfBulmaOyunu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> harfListesi = new ArrayList<>();

            // Başlangıçta rastgele harfler ekleyelim (örnek: 4 harf)
            harfListesi.add("a");
            harfListesi.add("k");
            harfListesi.add("m");
            harfListesi.add("z");

            System.out.println("Başlangıç listesi: " + harfListesi);

            // Kullanıcıdan 4 harf alacağız
            for (int i = 1; i <= 4; i++) {
                System.out.print(i + ". harfi girin: ");
                String girilenHarf = scanner.nextLine().toLowerCase(); // Küçük harfe çevir

                if (harfListesi.contains(girilenHarf)) {
                    // Harf varsa, bulunduğu index'e "found" yaz
                    int index = harfListesi.indexOf(girilenHarf);
                    harfListesi.set(index, "found");
                    System.out.println(" ' " + girilenHarf + "' bulundu ve 'found' olarak değiştirildi.");
                } else {
                    // Harf yoksa, listeye ekle
                    harfListesi.add(girilenHarf);
                    System.out.println(" ' " + girilenHarf + "' listeye eklendi.");
                }
            }

            // Güncellenmiş listeyi yazdır
            System.out.println("\n Güncellenmiş liste: " + harfListesi);
        }
    }

