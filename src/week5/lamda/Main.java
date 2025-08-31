package week5.lamda;

    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

            numbers.replaceAll(n -> n * 2);         // sayıları iki katına çıkar
            numbers.forEach(System.out::println);  // ekrana yazdır
        }
    }

