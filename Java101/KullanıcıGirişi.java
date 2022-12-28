import java.util.Scanner;

public class KullanıcıGirişi {

    public static void main(String[] args) {
        String username, password;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        username=input.nextLine();
        System.out.print("Şifreniz: ");
        password=input.nextLine();
        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }
        else{
            System.out.println("Bilgileriniz Hatalı!");
            System.out.print("Yeni şifre oluşturmak ister misiniz? (y/n)");
            String check=input.nextLine();
            if(check.equals("y")){
                System.out.print("Yeni şifreyi giriniz: ");
                String newpass=input.nextLine();
                while(newpass.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                    newpass=input.nextLine();
                }
                    System.out.println("Şifre oluşturuldu.");
            }
            else{
                System.out.println("İyi uçuşlar dileriz...");
            }
        }
    }
}
//www.patika.dev
