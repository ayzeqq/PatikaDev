import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        int sayi=input.nextInt();
        input.close();
        int result=0;
        while(sayi>0){
            result+=sayi%10;
            sayi=sayi/10;
        }
        System.out.println(result);
    }
}
//www.patika.dev
