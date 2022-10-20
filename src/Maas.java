public class Maas {
    String name;
    String surname;
    int salary;
    int workHours;
    int hireYear;


    public Maas(String name, String surname, int salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(int salary){
        if(salary>1000){
            this.salary=salary-(salary*3/100);
            System.out.println("Vergisi düşülmüş yeni maaş: "+this.salary+"TL");
        }else{
            System.out.println("Yeterli gelir olmadığı için maaşa vergi uygulanmayacak.");
        }
        return this.salary;
    }
    public int bonus(int workHours){
        if (workHours>40){
            salary+=(((workHours-40)*30)*4);  //*4 diyerek 4 haftalık fazla mesai maaşa eklendi
            System.out.println("Haftalık fazla mesai geliri: "+((workHours-40)*30)+"TL");
        }else{
            System.out.println("Fazla mesai bulunumadı..");
        }
        return salary;
    }

    public int raiseSalary(int hireYear){
        int today=2021;
        if (today-hireYear<10){
            System.out.println("Yeni zam miktarı: "+((salary*5)/100)+"TL");
            salary+=(salary*5)/100;
        } else if (today-hireYear>9 && hireYear-today<20) {
            System.out.println("Yeni zam miktarı: "+((salary*10)/100)+"TL");
            salary+=(salary*10)/100;
        } else if (today-hireYear>19) {
            System.out.println("Yeni zam miktarı: "+((salary*15)/100)+"TL");
            salary+=(salary*15)/100;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Calisan :" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Salary=" + salary +
                ", WorkHours=" + workHours +
                ", HireYear=" + hireYear +
                '}';
    }
}
