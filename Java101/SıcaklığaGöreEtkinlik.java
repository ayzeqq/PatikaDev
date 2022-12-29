import java.util.Scanner;

public class SıcaklığaGöreEtkinlik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Hava sıcaklığı kaç derece? ");
        int sıcaklık=input.nextInt();
        if(sıcaklık<=5){System.out.println("Kayak yapabilirsiniz.");}
        if(sıcaklık>=5 && sıcaklık<=15){System.out.println("Sinemaya gidebilirsiniz.");}
        if(sıcaklık>=15 && sıcaklık<=25){System.out.println("Piknik yapmaya gidebilirsiniz.");}
        if(sıcaklık>=25){System.out.println("Yüzmeye gidebilirsiniz.");}
    }
}
//www.patika.dev
