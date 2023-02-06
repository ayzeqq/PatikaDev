import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Çalışanın Adı ve Soyadını Giriniz: ");
        String name=input.nextLine();
        System.out.print("Çalışanın Maaşını Giriniz: ");
        int salary=input.nextInt();
        System.out.print("Haftalık Çalışma Saatini Giriniz: ");
        int workHours=input.nextInt();
        System.out.print("İşe Başlangıç Yılını Giriniz: ");
        int hireYear=input.nextInt();
        Employee employee = new Employee(name, salary, workHours, hireYear);
        employee.String();
        input.close();

    }
}
//www.patika.dev
