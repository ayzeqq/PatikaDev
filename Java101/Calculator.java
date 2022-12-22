import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("İlk sayıyı giriniz:");
        int a=input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int b=input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz: +,-,*,/");
        String c = input.next();
        switch (c) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b!=0){
                    System.out.println(a/b);
                }
                else{
                    System.out.println("Sayı sıfıra bölünemez!");
                }
                break;
            default:
                break;
        }
    }
}
//www.patika.dev
