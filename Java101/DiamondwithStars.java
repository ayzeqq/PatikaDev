import java.util.Scanner;

public class DiamondwithStars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Elmas Yüksekliğini Giriniz: ");
        int n=input.nextInt()/2;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=(2*i+1);k>0;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
//www.patika.dev
