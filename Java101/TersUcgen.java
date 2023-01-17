import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi=input.nextInt();
        for(int i=0;i<sayi;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=(2*sayi-1-(2*i));j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
//www.patika.dev
