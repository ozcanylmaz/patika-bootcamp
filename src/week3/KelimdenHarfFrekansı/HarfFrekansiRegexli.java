package week3.KelimdenHarfFrekansı;

import java.util.*;
import java.util.*;

public class HarfFrekansiRegexli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimeleri giriniz: ");
        String input = scanner.nextLine();

        // Sadece harfleri al, diğer her şeyi sil ve küçült
        input = input.toLowerCase().replaceAll("[^a-zğüşöçı]", "");

        Map<Character, Integer> frekansMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frekansMap.put(ch, frekansMap.getOrDefault(ch, 0) + 1);
        }

        // Sonuçları yazdır
        for (Map.Entry<Character, Integer> entry : frekansMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
