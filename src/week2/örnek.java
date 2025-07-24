package week2;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class örnek {


        public static void main(String[] args) {

            System.out.println(LocalDateTime.now());
            System.out.println(LocalDate.now());

            System.out.println();

            System.out.println(LocalDate.now().plusDays(30));
        }
    }
