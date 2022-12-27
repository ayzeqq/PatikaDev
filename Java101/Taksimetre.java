import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz(km): ");
        int km=input.nextInt();
        double tutar=10+km*2.2;
        if(tutar<20){
            tutar=20;
        }
        System.out.println("Tutar: " + tutar + " TL");

    }
}
//https://www.patika.dev/
