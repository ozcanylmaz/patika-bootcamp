package week1;

import java.util.Scanner;

public class ÇinZodyağı {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Doğum yılınızı giriniz : ");
            int age = input.nextInt();
            int result = age % 12;

            switch (result) {
                case 0:
                    System.out.println("Çin Zodyağı Burcunuz : Maymun");
                case 1:
                    System.out.println("Çin Zodyağı Burcunuz : Horoz");
                case 2:
                    System.out.println("Çin Zodyağı Burcunuz : Köpek");
                case 3:
                    System.out.println("Çin Zodyağı Burcunuz : Domuz");
                case 4:
                    System.out.println("Çin Zodyağı Burcunuz : Fare");
                case 5:
                    System.out.println("Çin Zodyağı Burcunuz : öküz");
                case 6:
                    System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                case 7:
                    System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                case 8:
                    System.out.println("Çin Zodyağı Burcunuz : Ejderha");
                case 9:
                    System.out.println("Çin Zodyağı Burcunuz : Yılan");
                case 10:
                    System.out.println("Çin Zodyağı Burcunuz : At");
                case 11:
                    System.out.println("Çin Zodyağı Burcunuz : koyun");
            }
        }
    }

