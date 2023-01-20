import java.util.Scanner;

public class Metot_Recursive {
    
    static void pattern(int a, int b, int c, int count){
        System.out.print(a+" ");
        a=a-b;
        if(a>0){
            count=count+c;
            if(count!=0){
                pattern(a,b,c,count);
            }
        }else{
            System.out.print(a+" ");
            b=-b;
            c=-c;
            a=a-b;
            pattern(a,b,c,count);
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int number=input.nextInt();
        pattern(number,5,1,1);
    }
}
//www.patika.dev
