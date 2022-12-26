import java.util.Scanner;

public class DikÜçgendeHipotenüsBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci dik kenar uzunluğu: ");
        int a=input.nextInt();
        System.out.println("İkinci dik kenar uzunluğu: ");
        int b=input.nextInt();
        double c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs= " + c);
        double u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı= " + alan);
    }
}
//https://wwww.patika.dev/
