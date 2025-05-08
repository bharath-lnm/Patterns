package MRAT;

public class MRATn3 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=1; i<=rows; i++){
            for(j=1; j<=(rows-i); j++){
                System.out.print(" "+" ");
            }
            for(j=rows+1-i; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}