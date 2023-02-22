import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int hak=8;
        int[] wrong = new int[hak];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < hak) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Kalan hak: " + (hak - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                wrong[right++] = selected;
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println("<< AŞAĞI >>" + " (Kalan Hak: " + (hak - right) + ")");
                } else {
                    System.out.println("<< YUKARI >>" + " (Kalan Hak: " + (hak - right) + ")");
                }
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz! ");
            if (!isWrong) {
                System.out.println("Cevap: "+ number + " , Tahminleriniz: " + Arrays.toString(wrong));
            }
        }

    }
}
//www.patika.dev
