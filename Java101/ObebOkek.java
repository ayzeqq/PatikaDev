import java.util.Scanner;

public class ObebOkek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        int n1=input.nextInt();
        System.out.print("n2 sayısını giriniz:");
        int n2=input.nextInt();
        int i=1;
        int j=1;
        int obeb=1;
        int okek=1;
        while(i<=Math.min(n1,n2)){
            if(n1%i==0 && n2%i==0){
                obeb=i;
            }
            i++;
        }
        System.out.println("OBEB = "+obeb);
        while(j<=n1*n2){
            if(j%n1==0 && j%n2==0){
                okek=j;
                break;
            }
            j++;
        }
        System.out.println("OKEK = "+okek);

    }
}
//www.patika.dev
