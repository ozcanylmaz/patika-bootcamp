package week1.MinMax;

import java.util.Scanner;

public class MinMax {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("kaç adet sayı gireceksiniz" );
    int n = input.nextInt();

    int min = 0;
    int max = 0;
    int number ;

    for (int i = 1; i <= n; i++) {
        System.out.println(i + ". sayıyı giriniz : ");
         number = input.nextInt();

        if (number < min) {
            min = number;
        }
        if (number > max){
            max = number ;
        }
    }

    System.out.println("girilen sayılar arasında en küçük sayı : " + min);
    System.out.println("girilen sayılar arasında en büyük sayı : " + max);
}

}
