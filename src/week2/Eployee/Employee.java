package week2.Eployee;

public class Employee {

    String name;

    double salary;

    int workHours;

    int hireYear;

    double taxAmount;
    double bonus;
    double raisisngAmount;
    int today = 2021;



   public Employee(String name, double salary, int workHours, int hireYear){
       this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    public void tax(){

       if (this.salary > 1000){
          this.taxAmount = this.salary * 0.03;
           System.out.println("vergi miktarı: " + this.taxAmount);
       }else{
           System.out.println("vergisiz maaş alıyorsunuz. ");
       }
    }

    public void bonus(){
       if (this.workHours > 40) {
           this.bonus = (workHours - 40) * 30;
           System.out.println("ekstra çalışma saatelrine uygulanan bonus miktarı: " + this.bonus);
       } else {
           System.out.println("bonus almaya hak kazanmadınız. ");

       }
    }

    public void raiseSalary(){

       if (today - this.hireYear <= 9) {

           this.raisisngAmount = this.salary * 0.05;
           System.out.println("maaşa yapılacak artış: " + this.raisisngAmount);

       } else if (today - this.hireYear > 10 && today - this.hireYear <19 ) {

          this.raisisngAmount = this.salary * 0.10;
            System.out.println("maaşa yapılacak artış: " + this.raisisngAmount);

       } else if (today - this.hireYear > 20){

           this.raisisngAmount = this.salary * 0.15;
           System.out.println("maaşa yapılacak artış: " + this.raisisngAmount);

       }else{
           System.out.println("hatalı giriş.");
    }


    }

    public void printInfo(){

        System.out.println(" ");
        System.out.println("<><><><>><<><><><><><><> ");
        System.out.println("çalışanın adı " + getName());
        System.out.println("çalışanınmaaşı: " + getSalary());
        System.out.println("toplam artışlar ve vergi ile maaş: "+(this.salary + this.taxAmount + this.bonus + this.raisisngAmount));System.out.println("çalışanın çalışma saatleri: " + getWorkHours());
        System.out.println("çalışanın çalışmaya başladığı yıl: " + getHireYear());
        System.out.println("<><><><>><<><><><><><><>");

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
       this.name = name;

    }
    public int getHireYear(){
       return  hireYear;
    }
    public void setHireYear(int hireYear) {
       this.hireYear = hireYear;

    }public  int getWorkHours() {
       return  workHours;
    }
    public  void  setWorkHours(int workHours) {
       this.workHours = workHours;
    }
    public double getSalary() {
       return salary;
    }
    public void setSalary(double salary) {
       this.salary = salary;
    }
}