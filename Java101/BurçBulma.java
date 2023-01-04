import java.util.Scanner;

public class BurçBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Ayınızı Giriniz: ");
        int ay=input.nextInt();
        System.out.print("Doğum Gününüzü Giriniz: ");
        int gun=input.nextInt();
        String burc="";
        if(ay==1){
            if(gun>=22 && gun<=31){
                burc="Kova";
            }
            else if(gun<22 && gun>=1){
                burc="Oğlak";
            }
        }
        if(ay==2){
            if(gun>=20 && gun<=29){
                burc="Balık";
            }
            else if(gun<20 && gun>=1){
                burc="Kova";
            }
        }
        if(ay==3){
            if(gun>=21 && gun<=31){
                burc="Koç";
            }
            else if(gun<21 && gun>=1){
                burc="Balık";
            }
        }
        if(ay==4){
            if(gun>=21 && gun<=30){
                burc="Boğa";
            }
            else if(gun<21 && gun>=1){
                burc="Koç";
            }
        }
        if(ay==5){
            if(gun>=22 && gun<=31){
                burc="İkizler";
            }
            else if(gun<22 && gun>=1){
                burc="Boğa";
            }
        }
        if(ay==6){
            if(gun>=23 && gun<=30){
                burc="Yengeç";
            }
            else if(gun<23 && gun>=1){
                burc="İkizler";
            }
        }
        if(ay==7){
            if(gun>=23 && gun<=31){
                burc="Aslan";
            }
            else if(gun<23 && gun>=1){
                burc="Yengeç";
            }
        }
        if(ay==8){
            if(gun>=23 && gun<=31){
                burc="Başak";
            }
            else if(gun<23 && gun>=1){
                burc="Aslan";
            }
        }
        if(ay==9){
            if(gun>=23 && gun<=30){
                burc="Terazi";
            }
            else if(gun<23 && gun>=1){
                burc="Başak";
            }
        }
        if(ay==10){
            if(gun>=23 && gun<=31){
                burc="Akrep";
            }
            else if(gun<23 && gun>=1){
                burc="Terazi";
            }
        }
        if(ay==11){
            if(gun>=22 && gun<=30){
                burc="Yay";
            }
            else if(gun<22 && gun>=1){
                burc="Akrep";
            }
        }
        if(ay==12){
            if(gun>=22 && gun<=31){
                burc="Oğlak";
            }
            else if(gun<22 && gun>=1){
                burc="Yay";
            }
        }
        if(ay<=12 && ay>=1 && !burc.equals("")){
            System.out.println("Burcunuz " + burc + " burcudur.");
        }
        else{
            System.out.println("Geçerli bir değer girilmedi!");
        }
    }
}
//www.patika.dev
