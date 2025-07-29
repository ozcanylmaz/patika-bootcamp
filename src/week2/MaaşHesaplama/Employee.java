package week2.MaaşHesaplama;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Constructor
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama (40 saati geçen her saat için 30 TL)
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş zammı hesaplama (2021 yılına göre)
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Bilgileri ekrana bastıran toString metodu
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonus ile Maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş: " + totalSalary;
    }
}