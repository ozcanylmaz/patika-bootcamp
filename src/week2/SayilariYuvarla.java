package  week2;

import java.util.Scanner;

class SayilariYuvarla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ondalıklı bir sayı girin: ");
        double sayi = scanner.nextDouble();

        // Aşağı yuvarlama (floor)
        int asagiYuvarlama = (int) Math.floor(sayi);

        // Yukarı yuvarlama (ceil)
        int yukariYuvarlama = (int) Math.ceil(sayi);

        // En yakın tam sayıya yuvarlama (round)
        int enYakinTamSayi = (int) Math.round(sayi);

        System.out.println("Aşağı yuvarlama: " + asagiYuvarlama);
        System.out.println("Yukarı yuvarlama: " + yukariYuvarlama);
        System.out.println("En yakın tam sayı: " + enYakinTamSayi);

        scanner.close();
    }
}