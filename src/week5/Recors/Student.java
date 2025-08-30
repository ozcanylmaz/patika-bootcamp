package week5.Recors;

// Student.java
public record Student(String firstName, String lastName, int studentNumber) {

    // İstersen ekstra metot ekleyebilirsin
    public String fullName() {
        return firstName + " " + lastName;
    }
}

