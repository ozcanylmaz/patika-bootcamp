package week3.TheTwoClosestNumbersToEachOther;

import java.util.ArrayList;

import java.util.Collections;

import static javax.swing.UIManager.get;

public class TheTwoClosestNumbersToEachOther {
    public static void main(String[] args) {
        ArrayList<Integer> sayılar = new ArrayList<>();

        //10 adet benzersiz ve pozıtıf sayı ekliyoruz

        sayılar.add(11);
        sayılar.add(3);
        sayılar.add(20);
        sayılar.add(14);
        sayılar.add(22);
        sayılar.add(1);
        sayılar.add(7);
        sayılar.add(50);
        sayılar.add(24);
        sayılar.add(12);
        //küçülten büyüğe sıralıyoruz
        Collections.sort(sayılar);

        int minFark = Integer.MAX_VALUE;
        int sayı1 = 0, sayı2 = 0;

        for (int i = 0; i < sayılar.size() -1; i++) {
            int fark = sayılar.get(i + 1)-sayılar.get(i);
            if (fark < minFark) {
                minFark = fark;
                sayı1 = sayılar.get(i);
                sayı2 = sayılar.get(i +1);
            }
        }
        System.out.println("birbirine ne yakın iki sayı: " + sayı1 +"ve" +sayı2);
    }
}
