import java.util.Scanner;

public class Recursive_AsalSayi {
    
    static boolean isPrime(int a, int b){
        if(a==1){
            return false;
        }
        else if(a%b!=0){
            return isPrime(a,b-1);
        }
        else{
            if(b==1){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number=input.nextInt();
        if(isPrime(number, number-1)){
            System.out.println(number+" Asal Sayıdır.");
        }
        else{
            System.out.println(number+" Asal Sayı Değildir.");
        }
    }
}
//www.patika.dev
