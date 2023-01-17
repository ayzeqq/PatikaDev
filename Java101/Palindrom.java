import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Girini: ");
        int sayi=input.nextInt();
        int check=sayi;
        int number=0;
        while(check>0){
            number=number*10+check%10;
            check=check/10;
        }
        if(sayi==number){
            System.out.println(sayi + " palindrom sayıdır.");
        }
        else{
            System.out.println(sayi + " palindrom sayı değildir.");
        }
    }
}
//www.patika.dev
