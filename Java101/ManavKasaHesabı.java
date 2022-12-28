import java.util.Scanner;

public class ManavKasaHesabı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        double armut=input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        double elma=input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        double domates=input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        double muz=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlıcan=input.nextDouble();
        double a=2.14*armut;
        double e=3.67*elma;
        double d=1.11*domates;
        double m=0.95*muz;
        double p=5.00*patlıcan;
        System.out.println("Toplam Tutar : " + (a+e+d+m+p) + "TL");
    }
}
//www.patika.dev
