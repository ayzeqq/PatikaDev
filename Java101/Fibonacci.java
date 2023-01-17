import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Fibonacci uzunluğu kaç olsun? ");
        int sayi=input.nextInt();
        int i=0;
        int sayi1=0, sayi2=1, temp=1;
        if(sayi>0){
            System.out.print(sayi1+" ");
        }
        while(i<sayi-1){
            System.out.print(temp+" ");
            temp=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=temp;
            i++;
        }
        
    }
}
//www.patika.dev
