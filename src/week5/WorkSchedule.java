package week5;

import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayInfo dayInfo = new DayInfo();

        while (true) {
            System.out.println("\n1 - Gün seç ve çalışma saatini öğren");
            System.out.println("2 - Haftanın tüm günlerini listele");
            System.out.println("0 - Çıkış");
            System.out.print("Seçiminiz: ");
            int choice;

            // Kullanıcının sayı girdiğinden emin ol
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // buffer temizleme
            } else {
                System.out.println("Lütfen geçerli bir sayı girin!");
                scanner.nextLine(); // hatalı girişi temizle
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Gün giriniz (örnek: MONDAY): ");
                    String dayInput = scanner.nextLine().trim().toUpperCase();
                    try {
                        Day selectedDay = Day.valueOf(dayInput);
                        System.out.println(selectedDay + " günü çalışma saatleri: " + dayInfo.getWorkHours(selectedDay));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Geçersiz gün girdiniz!");
                    }
                    break;

                case 2:
                    System.out.println("=== Haftalık Çalışma Saatleri ===");
                    dayInfo.printAllDays();
                    break;

                case 0:
                    System.out.println("Çıkılıyor...");
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
