package week2;

import java.util.Scanner;

public class GeçerliŞifreKontrolüü {
    public static void main(String[] args) {
       // Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.
        //1-En az 8 karakter içermeli
        //2-Space karakteri içermemeli
        //3-İlk harf büyük harf olmalı,
        //4-Son karakteri ? olmalı
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Şifrenizi Giriniz : ");
        String psw = input.nextLine();

        Boolean uzunMu = psw.length()>=8;

        boolean ilkharfbüyükolmazlı = false;
        for (int i=0; i<psw.length(); i++) {
            char c = psw.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                ilkharfbüyükolmazlı = true;
            }
        }
                boolean kucukHarfvarMı = false;
                for (int i=0; i<psw.length(); i++){
                    char c = psw.charAt(i);
                    if(c>='a' && c<='z'){
                        kucukHarfvarMı=true;


                    }
        }

                boolean ozelkarakterVarmı = psw.contains("?");

                if(uzunMu && ilkharfbüyükolmazlı && kucukHarfvarMı && ozelkarakterVarmı) {
                    System.out.println("şifre geçerli");
                }else{
                    System.out.println("şifre geçerli değil");

                }
    }
}
