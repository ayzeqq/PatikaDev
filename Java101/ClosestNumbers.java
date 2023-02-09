import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) throws Exception {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number=input.nextInt();
        input.close();
        int min = list[0];
        int max = list[0];
        int rp=Integer.MAX_VALUE;
        int rm=Integer.MAX_VALUE;
        for(int i: list){
            if(Math.abs(number-i)<rp && number<i){
                max=i;
                rp=Math.abs(number-i);
            }
            if(Math.abs(number-i)<Math.abs(rm) && i<number){
                min=i;
                rm=Math.abs(number-i);
            }
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen sayı: " + number);
        if(rm==Integer.MAX_VALUE){
            System.out.println("Girilen sayıdan küçük en yakın sayı : Bulunmamaktadır.");
        }
        else{
            System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
        }
        if(rp==Integer.MAX_VALUE){
            System.out.println("Girilen sayıdan büyük en yakın sayı : Bulunmamaktadır.");
        }
        else{
            System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
        }
    }
}
//www.patika.dev
