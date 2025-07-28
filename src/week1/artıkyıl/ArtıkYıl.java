package week1.artıkyıl;

import java.util.Scanner;

public class ArtıkYıl {

        public static void main(String[] args) {
            // 4'e tam bölünecek
            // 100'ün katlarından 400'ün katları olanlar sayılacak

            Scanner input = new Scanner(System.in);
            System.out.println("Yıl giriniz " );
            int year = input.nextInt();

            // 1700
            // 2024

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + "Artık yıldır.");
            } else {
                System.out.println(year + "Artık yıl değişir.");

            }
        }
    }

