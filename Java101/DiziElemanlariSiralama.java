import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç sayı girilecek? ");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+"."+ "sayıyı giriniz: ");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//www.patika.dev
