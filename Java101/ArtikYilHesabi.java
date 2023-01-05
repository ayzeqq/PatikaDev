import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        int yil=input.nextInt();
        if(yil%100==0 && yil%400==0){
            System.out.println(yil + " bir artık yıldır.");
        }
        else if(yil%100==0){
            System.out.println(yil + " bir artık yıl değildir.");
        }
        else if(yil%4==0){
            System.out.println(yil + " bir artık yıldır.");
        }
        else{
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
//www.patika.dev
