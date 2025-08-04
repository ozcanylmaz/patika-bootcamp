package week3.KelimdenHarfFrekansı;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansıBulmaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kelimeleri giriniz; ");
        String kelime = scanner.nextLine().toLowerCase();

        Map<Character, Integer> frekans = new HashMap<>();

        for (char c : kelime.toCharArray()) {
            if (Character.isLetter(c)) {
                frekans.put(c, frekans.getOrDefault(c,0) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getKey());
        }
    }
}
