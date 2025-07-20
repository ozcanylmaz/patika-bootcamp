package week1;

import java.util.Scanner;

public class MukemmelSayı {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);

        System.out.println("bir sayı giriniz");
        int n = input.nextInt();

        int total = 0;
           for (int i =1; i < n; i++) {
               if (n % i == 0) {
                total += i;

            }
        }

           if (total == n ) {
               System.out.println(n + " sayısı mükemel bir sayıdır. ");
           } else {
               System.out.println(n + " sayısı mükemel bir sayı değildir.");
           }
    }
}
