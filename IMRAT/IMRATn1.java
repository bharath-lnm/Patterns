package IMRAT;

public class IMRATn1 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows; i>=1; i--){
            for(j=0; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for(j=i; j>=1; j-- ) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
