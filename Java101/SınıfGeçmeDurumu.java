import java.util.Scanner;

public class SınıfGeçmeDurumu {
    public static void main(String args[]) {
      Scanner input=new Scanner(System.in);
      System.out.print("Matematik notunuz: ");
      int mat=input.nextInt();
      System.out.print("Fizik notunuz: ");
      int fiz=input.nextInt();
      System.out.print("Türkçe notunuz: ");
      int tür=input.nextInt();
      System.out.print("Kimya notunuz: ");
      int kim=input.nextInt();
      System.out.print("Müzik notunuz: ");
      int müz=input.nextInt();
      int sum=0;
      int count=0;
      int[] dizi={mat,fiz,tür,kim,müz};
      for(int i=0;i<5;i++){
          if(dizi[i]<=100 && dizi[i]>=0){
              sum+=dizi[i];
              count++;
          }
      }
      if(count==0){
        System.out.println("Hesaplanabilecek değerler girilmedi!");
      }
      else{
        int ort=sum/count;
        if(ort>=55){
            System.out.println(ort + " Not Ortalamasıyla GEÇTİNİZ!");
        }
        else{
            System.out.println(ort + " Not Ortalamasıyla KALDINIZ!");
        }
    }
    }
}
//www.patika.dev
