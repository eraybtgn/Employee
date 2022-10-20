public class Emp {
    public static void main(String[] args) {
    Maas emp1 = new Maas("Eray","Batıgün",2800,45,2017);
        System.out.println(emp1);
    emp1.tax(emp1.salary);
    emp1.bonus(emp1.workHours);
    emp1.raiseSalary(emp1.hireYear);

        System.out.println(emp1);

    }


}
