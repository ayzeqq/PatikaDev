import java.util.Scanner;

public class UsluSayiHesabi_Recursive {
    
    static int us(int a, int b){
        if(b==0){
            return 1;
        }
        if(a==0){
            return 0;
        }
        int result=a*us(a,(b-1));
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int a=input.nextInt();
        System.out.print("Üssü giriniz: ");
        int b=input.nextInt();
        System.out.println(us(a,b));
    }
}
//www.patika.dev
