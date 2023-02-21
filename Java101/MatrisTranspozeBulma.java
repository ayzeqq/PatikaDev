public class MatrisTranspozeBulma {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int[][] arrT=new int [3][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arrT[j][i]=arr[i][j];
            }
        }
        System.out.println("Matris:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze:");
        for(int i=0;i<arrT.length;i++){
            for(int j=0;j<arrT[i].length;j++){
                System.out.print(arrT[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
//www.patika.dev
