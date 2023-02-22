import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word=input.nextLine();
        input.close();
        char[] letters=word.toCharArray();
        char[] ltrs=new char[letters.length];
        for(int i=0, j=letters.length-1;i<letters.length;i++,j--){
            ltrs[j]=letters[i];
        }
        int count=0;
        for(int i=0;i<letters.length;i++){
            if(letters[i]!=ltrs[i]){
                count++;
            }
        }
        if(count==0){
            System.out.println("Palindromik Kelime!");
        }
        else{
            System.out.println("Palindromik Değil!");
        }
    }
}
//www.patika.dev
