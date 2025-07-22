package week1;

public class Matris {

        public static void main(String[] args) {
            // Orijinal matris (2x3)
            int[][] matris = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            // Matris boyutları
            int satir = matris.length;
            int sutun = matris[0].length;

            // Transpoz matrisi (3x2)
            int[][] transpoz = new int[sutun][satir];

            // Transpoz alma işlemi
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    transpoz[j][i] = matris[i][j];
                }
            }

            // Orijinal matrisin yazdırılması
            System.out.println("Orijinal Matris:");
            yazdirMatris(matris);

            // Transpoz matrisin yazdırılması
            System.out.println("Transpoz (Devriği) Matris:");
            yazdirMatris(transpoz);
        }

        // Yardımcı fonksiyon: matrisi yazdır
        public static void yazdirMatris(int[][] m) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }
    }



