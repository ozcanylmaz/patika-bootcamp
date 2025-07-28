package week2.MaaşHesaplama;

import week2.Eployee.Employee;

public class MaaşHesaplama {
    public static void main(String[] args) {

    Employee emp  = new Employee("Yılmaz özcan", 2000,45,1985);

    emp.tax();
    emp.bonus();
    emp.raiseSalary();
    emp.printInfo();
}

}

