package IMRAT;

public class IMRATS {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows; i>=1; i--){
            for(j=0; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for( j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
