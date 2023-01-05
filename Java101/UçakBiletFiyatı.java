import java.util.Scanner;

public class UçakBiletFiyatı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi Giriniz (KM) :");
        int mesafe=input.nextInt();
        System.out.println("Yaşınızı Giriniz :");
        int yaş=input.nextInt();
        System.out.println("TekYön (1) veya ÇiftYön (2) Tercihiniz :");
        int tip=input.nextInt();
        double tutar=mesafe*0.1;
        if(tip<1 || tip>2 || mesafe<0 || yaş<0){
            System.out.println("Hatalı değer girdiniz!");
        }
        else{
            if(yaş<12){
                tutar=tutar*0.5;
            }
            if(yaş>=12 && yaş<=24){
                tutar=tutar*0.9;
            }
            if(yaş>=65){
                tutar=tutar*0.7;
            }
            if(tip==2){
                tutar=tutar*0.8*2;
            }
            System.out.println("Toplam Tutar= " + tutar);
        }
    }
}
//www.patika.dev
