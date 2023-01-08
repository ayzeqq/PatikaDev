import java.util.Scanner;

public class ÜslüSayiHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n=input.nextInt();
        if(n==0){
            System.out.println("Hatalı giriş yaptınız!");
        }
        else{
            for(int i=4;i<6;i++){
                System.out.println(i+" sayısının kuvvetleri:");
                System.out.println("========================");
                for(int a=0;Math.pow(i,a)<n;a++){
                    System.out.println(i+"^"+a+"="+(int)Math.pow(i,a));
                }
                System.out.println("");
            }
        }
    }
}
//www.patika.dev
