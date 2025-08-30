package week5.Recors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Özcan", "Yılmaz", 1001);
        Student s2 = new Student("İsmail", "Kılıç", 1002);
        Student s3 = new Student("Özcan", "Yılmaz", 1001); // s1 ile aynı
        Student s4 = new Student("Ali", "biner", 1004);

        System.out.println("Öğrenci 1: " + s1);
        System.out.println("Öğrenci 2: " + s2);
        System.out.println("Öğrenci 3: " + s3);
        System.out.println("öğrenci 4: " + s4);

        System.out.println("Tam Adı (s1): " + s1.fullName());

        // equals ve hashCode kontrolü
        System.out.println("s1 == s2 ? " + s1.equals(s2));
        System.out.println("s1 == s3 ? " + s1.equals(s3));
        System.out.println("s1.hashCode() == s3.hashCode()? " + (s1.hashCode() == s3.hashCode()));
    }
}


