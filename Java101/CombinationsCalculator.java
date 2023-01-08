import java.util.Scanner;

public class CombinationsCalculator {
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        int result=a;
        for(int i=a-1;i>0;i--){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("C(n,r) kombinasyon hesabı için n'yi giriniz:");
        int n=input.nextInt();
        System.out.println("C(n,r) kombinasyon hesabı için r'yi giriniz:");
        int r=input.nextInt();
        int c=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("C("+n+","+r+")="+c);
    }
}
//www.patika.dev
