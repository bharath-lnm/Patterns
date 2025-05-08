package PYRAMID;

public class pyramid1 {
     public static void main(String[] args) {
        int i,j;
        int rows=4;
         for(i=1;i<=rows; i++){
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
         }
         for(i=rows;i>=1; i--){
            for(j=1;j<=i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
         }
     }
    
}
