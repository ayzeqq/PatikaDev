import java.util.Scanner;

class UsluSayiHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        int a=input.nextInt();
        System.out.print("Üs değerini giriniz:");
        int b=input.nextInt();
        int result=a;
        if(b==0){
            System.out.println(a+"^"+b+"="+1);
        }
        else{
            for(int i=1;i<b;i++){
                result*=a;
            }
            System.out.println(a+"^"+b+"="+result);
        }  
    }
}
//www.patika.dev
