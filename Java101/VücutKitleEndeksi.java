import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo=input.nextInt();
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy=input.nextDouble();
        double vki=kilo/(boy*boy);
        String sonuç="";
        if(vki<20){
            sonuç="Zayıf";
        }
        if(vki>25){
            sonuç="Fazla kilolu";
        }
        if(vki>=20 && vki<=25){
            sonuç="Normal";
        }
        System.out.println("Vücut Kitle İndeksiniz: " + vki + " ("+sonuç+")");
    }
}
//www.patika.dev
