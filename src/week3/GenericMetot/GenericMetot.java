package week3.GenericMetot;

public class GenericMetot {

    // Generic metot tanımı
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Yeni satıra geç
    }

    // main metodu - örnek kullanım
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        printArray(intArray);
        printArray(strArray);
    }
}