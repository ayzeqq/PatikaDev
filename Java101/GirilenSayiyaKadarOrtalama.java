import java.util.Scanner;

public class GirilenSayiyaKadarOrtalama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int result=0;
        int count=0;
        for(int i=1;i<sayi;i++){
            if(i%3==0 && i%4==0){
                result+=i;
                count++;
            }
        }
        System.out.println(result/count);
    }
}
//www.patika.dev
