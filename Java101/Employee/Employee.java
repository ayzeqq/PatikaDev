public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){
        if(this.salary>1000){
            this.tax=this.salary*0.03;
        }
        else{
            this.tax=0;
        }
    }

    void bonus(){
        if(this.workHours>40){
            this.bonus=(this.workHours-40)*30;
        }
        else{
            this.bonus=0;
        }
    }

    void raiseSalary(){
        if(2021-this.hireYear<10){
            this.raise=this.salary*0.05;
        }
        if(2021-this.hireYear>9 && 2021-this.hireYear<20){
            this.raise=this.salary*0.1;
        }
        if(2021-this.hireYear>19){
            this.raise=this.salary*0.15;
        }
    }

    void String(){
        tax();
        bonus();
        raiseSalary();
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaş Artışı: " + this.raise);
        System.out.println("Vergi ve Bonuslar Dahil Maaş: " + (this.salary+this.raise+this.bonus-this.tax));
        System.out.println("Toplam Maaş: " + (this.salary+this.raise));
    }
}
