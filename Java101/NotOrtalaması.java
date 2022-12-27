import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:");
        int Mat=input.nextInt();
        System.out.print("Fizik notunu giriniz:");
        int Fiz=input.nextInt();
        System.out.print("Kimya notunu giriniz:");
        int Kim=input.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        int Tür=input.nextInt();
        System.out.print("Tarih notunu giriniz:");
        int Tar=input.nextInt();
        System.out.print("Müzik notunu giriniz:");
        int Müz=input.nextInt();
        int Ort=(Mat+Fiz+Kim+Tür+Tar+Müz)/6;
        String yılsonu=Ort>60? "Geçti." : "Kaldı.";
        System.out.println("Not Ortalamsı: " + Ort);
        System.out.println("Geçme Durumu: " + yılsonu);
    }   
}

//https://www.patika.dev/
