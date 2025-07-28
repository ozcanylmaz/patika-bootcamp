package week1.Manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            double elma = 3.67;
            double armut = 2.14;
            double domates = 1.11;
            double muz = 0.95;
            double patlıcan = 5.00;

            System.out.println("elma kaç kilo : ");
            double elmakilo = scan.nextDouble();

            System.out.println("armut kaç kilo : ");
            double armutkilo = scan.nextDouble();

            System.out.println("domates kaç kilo : ");
            double domateskilo = scan.nextDouble();

            System.out.println("muz kaç kilo : ");
            double muzkilo = scan.nextDouble();

            System.out.println("patlıcan kaç kilo : ");
            double patlıcankilo = scan.nextDouble();

            double toplam = 0.0;

            toplam += (elma * elmakilo);
            toplam += (armutkilo * armut);
            toplam += (domateskilo * domates);
            toplam += (muzkilo * muz);
            toplam += (patlıcankilo * patlıcan);
            System.out.println("toplma tutar :  " + toplam);
        }
    }

