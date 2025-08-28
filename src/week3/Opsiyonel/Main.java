package week3.Opsiyonel;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>(); // default kapasite 10

        // Başlangıç durumu
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        // Eleman ekleme testi
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        System.out.println("Liste: " + liste.toString());

        // indexOf ve lastIndexOf testleri
        System.out.println("İlk 20 indeksi: " + liste.indexOf(20));
        System.out.println("Son 20 indeksi: " + liste.lastIndexOf(20));
        System.out.println("100 indeksi: " + liste.indexOf(100)); // bulunamaz

        // get, set ve remove testleri
        System.out.println("2. indisteki değer: " + liste.get(2));
        liste.remove(2);
        System.out.println("2. indisteki değer (silindikten sonra): " + liste.get(2));
        liste.set(0, 100);
        System.out.println("Liste: " + liste.toString());

        // toArray testi
        Object[] dizi = liste.toArray();
        System.out.println("Array'in ilk elemanı: " + dizi[0]);

        // subList testi
        MyList<Integer> altListe = liste.subList(0, 3);
        System.out.println("Alt liste: " + altListe.toString());

        // contains testi
        System.out.println("Listemde 20 değeri var mı? " + liste.contains(20));
        System.out.println("Listemde 120 değeri var mı? " + liste.contains(120));

        // clear testi
        liste.clear();
        System.out.println("Liste temizlendikten sonra: " + liste.toString());
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
    }
}
