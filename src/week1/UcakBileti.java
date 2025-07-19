package week1;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int tripType = input.nextInt();

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double price = km * 0.10;
            double discount = 0.0;

            if (age < 12) {
                discount = 0.50;
            } else if (age <= 24) {
                discount = 0.10;
            } else if (age > 65) {
                discount = 0.30;
            }

            price = price * (1 - discount);

            if (tripType == 2) {
                price = price * 0.8 * 2;
            }

            System.out.println("Toplam tutar = " + price + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

        input.close();
    }

}