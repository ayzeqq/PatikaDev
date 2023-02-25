import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    static boolean isEnd(char[][] matris){
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                if(matris[i][j]=='-'){
                    return true;
                }
            }
        }
        System.out.println("======================");
        System.out.println("");
        System.out.println("Tebrikler, kazandınız!");
        System.out.println("");
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j]);
            }
            System.out.println("");
        }
        return false;
    }
    static void check(int a, int b, char[][] matris, char[][] matris2){
        int count=0;
        for(int i=Math.max(0,a-1);i<Math.min(a+2,matris.length);i++){
            for(int j=Math.max(0,b-1);j<Math.min(b+2,matris[i].length);j++){
                if(matris[i][j]=='*'){
                    count++;
                }
            }
        }
        char c=(char)(count+'0');
        matris[a][b]=c;
        matris2[a][b]=c;
        for(int i=0; i<matris2.length; i++){
            for(int j=0; j<matris2[i].length; j++){
                System.out.print(matris2[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Satır sayısı: ?");
        int x=input.nextInt();
        System.out.print("Sütun sayısı: ?");
        int y=input.nextInt();
        if(x*y>0){

            int m=x*y/4;
            char[][] matris=new char[x][y];
            char[][] matris2=new char[x][y];
            for(int i=0; i<matris.length; i++){
                for(int j=0; j<matris[i].length; j++){
                    matris[i][j]='-';
                }
            }
            
            for(int i=0; i<matris2.length; i++){
                for(int j=0; j<matris2[i].length; j++){
                    matris2[i][j]='-';
                }
            }

            Random rand=new Random();
            int rand1;
            int rand2;
            for(int i=0;i<m;i++){
                rand1=rand.nextInt(x);
                rand2=rand.nextInt(y);
                if(matris[rand1][rand2]=='*'){
                    i--;
                    continue;
                }
                else{
                    matris[rand1][rand2]='*';
                }
            }

            for(int i=0; i<matris2.length; i++){
                for(int j=0; j<matris2[i].length; j++){
                    System.out.print(matris2[i][j]);
                }
                System.out.println("");
            }

            while(isEnd(matris)){
                System.out.print("Satır giriniz:");
                int a=input.nextInt();
                System.out.print("Sütun giriniz:");
                int b=input.nextInt();
                if(a<x && b<y){
                    if(matris[a][b]=='*'){
                        System.out.println("MAYIN - Oyunu kaybettiniz!");
                            for(int i=0; i<matris.length; i++){
                                for(int j=0; j<matris[i].length; j++){
                                    System.out.print(matris[i][j]);
                                }
                                System.out.println("");
                            }
                        break;
                    }
                    else{
                        check(a,b,matris,matris2);
                    }
                }
                else{
                    System.out.println("ALAN DIŞI - Yeniden Deneyiniz!");
                }
            }
        }

        else{
            System.out.println("0 boyutlu tarla oluşturulamadı!");
        }
    }
}
//www.patika.dev
