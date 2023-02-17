import java.util.Arrays;

public class TekrarEdenSayilar {
    
    static boolean isFind(int[] arr, int value){
        for(int k: arr){
            if(value==k){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
      int[] list={4,7,4,3,2,6,10,21,1,33,6,1};
      int[] dublicate=new int[list.length];
      for(int i=0;i<list.length;i++){
          for(int j=0;j<list.length;j++){
              if(i!=j && list[i]==list[j]){
                  if(!isFind(dublicate, list[i])){
                      dublicate[i]=list[i];
                  }
              }
          }
      }
      for(int m:dublicate){
          if(m!=0 && m%2==0){
              System.out.println(m);
          }
      }
    }
}
//www.patika.dev
