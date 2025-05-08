package IRAT;

public class IRATn3 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows; i>=1; i--){
            for(j=rows; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
