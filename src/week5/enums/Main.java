package week5.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Çalışma Programı Menüsü ---");
            System.out.println("1 - Gün seç ve çalışma saatini öğren");
            System.out.println("2 - Haftanın tüm günlerini listele");
            System.out.println("0 - Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // dummy

            switch (choice) {
                case 1:
                    System.out.print("Bir gün giriniz (örnek: MONDAY): ");
                    String input = scanner.nextLine().trim().toUpperCase();

                    try {
                        Day selectedDay = Day.valueOf(input);
                        System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkHours());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Geçersiz gün girdiniz! (Örn: MONDAY, TUESDAY...)");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Haftanın Tüm Günleri ve Çalışma Saatleri ---");
                    for (Day day : Day.values()) {
                        System.out.println(day + " : " + day.getWorkHours());
                    }
                    break;

                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin!");
            }

        } while (choice != 0);
    }
}
