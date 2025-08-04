package week3.KelimdenHarfFrekansı;

import java.util.*;

public class HarfFrekansi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimeleri giriniz: ");
        String input = scanner.nextLine();

        // Küçük harfe çevir ve harf olmayanları çıkar
        input = input.toLowerCase();

        Map<Character, Integer> frekansMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Sadece harfse
                frekansMap.put(ch, frekansMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Sonuçları yazdır
        for (Map.Entry<Character, Integer> entry : frekansMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
