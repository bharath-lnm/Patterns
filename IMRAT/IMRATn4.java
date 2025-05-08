package IMRAT;

public class IMRATn4 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows; i>=1; i--){
            for(j=0; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for(j=rows; j>=rows+1-i; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}