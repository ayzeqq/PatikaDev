import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat = input.nextDouble();
        if(fiyat>0 && fiyat<1000){
            System.out.println("KDV'siz Fİyat: " + fiyat);
            System.out.println("KDV'li Fİyat: " + fiyat*1.18);
            System.out.println("KDV tutarı: " + fiyat*0.18);
        }
        else if(fiyat<0){
            System.out.println("Değer 0'dan küçük girilemez!");
        }
        else{
            System.out.println("KDV'siz Fİyat: " + fiyat);
            System.out.println("KDV'li Fİyat: " + fiyat*1.08);
            System.out.println("KDV tutarı: " + fiyat*0.08);
        }
    }
}

//https://app.patika.dev/
