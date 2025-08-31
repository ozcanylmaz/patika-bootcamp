package week5.methodreference;

import java.util.*;

public class MethodReference {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep"));

        // Method reference ile liste elemanlarını yazdırma
        names.forEach(System.out::println);
    }
}
