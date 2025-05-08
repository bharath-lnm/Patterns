package PYRAMID;

public class pyramid3 {

    public static void main(String[] args) {
        int i,j;
        int rows=5;

        /*for(i=1; i<=rows;i++){
            for(j=1; j<=rows-i;j++){
                System.out.print(" "+" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(j=1;j<=i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

        for(i=rows-1; i>=1;i--){
            for(j=1; j<=rows-i;j++){
                System.out.print(" "+" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(j=1;j<=i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        
   }
}