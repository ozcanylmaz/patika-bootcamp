import java.util.Scanner;

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üst sınırı giriniz (1-10): ");
        int n = input.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Hatalı giriş! Lütfen 1 ile 10 arasında bir sayı giriniz.");
            return;
        }

        // Çarpım tablosunu yazdır
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Formatlı yazdırma (4 karakter genişlik)
                System.out.printf("%-4d", i * j);
            }
            System.out.println(); // Her satırdan sonra alt satıra geç
        }
    }

