import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? ");
        int sayi=input.nextInt();
        int[] arr=new int[sayi];
        for(int i=0;i<sayi;i++){
            System.out.print((i+1)+". sayı: ");    
            int num=input.nextInt();
            arr[i]=num;
        }
        int min=arr[0];
        int maks=arr[0];
        for(int j=0;j<arr.length;j++){
             maks=Math.max(arr[j],maks);
             min=Math.min(arr[j],min);
        }
        System.out.println("En büyük sayı: " + maks);
        System.out.println("En küçük sayı: " + min);
    }
}
//www.patika.dev
