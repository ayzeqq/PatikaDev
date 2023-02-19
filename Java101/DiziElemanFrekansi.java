import java.util.Scanner;

public class DiziElemanFrekansi {

    static boolean isFind(int[] array, int value){
        for(int i=0;i<value;i++){
            if(array[value]==array[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç sayı girilecek? ");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+"."+ "sayıyı giriniz: ");
            arr[i]=input.nextInt();
        }
        input.close();
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(!isFind(arr,i)){
                for(int j=0;j<arr.length;j++){
                    if(i!=j && arr[i]==arr[j]){
                        count++;
                    }
                }
            System.out.println(arr[i]+" sayısı "+count+" kere tekrar edildi.");
            count=1;    
            }
        }
    }
}
//www.patika.dev
