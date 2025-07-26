package week2;

import java.util.Scanner;

public class AsalSayıBulmaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int number = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + "sayısı ASALDIR.");

        } else {
            System.out.println("sayısı ASAL değildir");
        }
    }
}

