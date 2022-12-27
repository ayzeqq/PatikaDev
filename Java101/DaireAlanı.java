import java.util.Scanner;

public class DaireAlanı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Daire Yariçapini Giriniz: ");
        double yariçap=input.nextDouble();
        System.out.print("Alani hesaplanacak açi değerini giriniz:");
        int açi=input.nextInt();
        if(açi>360){
            açi=360;
        }
        if(açi<0){
            açi=0;
        }
        double çevre=2*3.14*yariçap;
        double alan=3.14*yariçap*yariçap;
        double alan2=(3.14*yariçap*yariçap)*açi/360;
        System.out.println("Dairenin Çevresi: " + çevre);
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Açılı Bölümün Alanı: " + alan2);
    }
}
//https://www.patika.dev/
