/*
Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan program.
*/

import java.util.Scanner;

public class TekSayiGirileneKadarOlanSayilarinToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;
        int sayi;
        do{
            System.out.print("Sayi Giriniz: ");
            sayi=input.nextInt();
            if(sayi%4==0){
                result+=sayi;
            }
        }
        while(sayi%2==0);
        System.out.println("4'e bölünebilen sayilarin toplami= " + result);
    }
}
//www.patika.dev
