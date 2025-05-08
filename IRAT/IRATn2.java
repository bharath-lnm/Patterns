package IRAT;

public class IRATn2 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows; i>=1;i--){
            for(j=1; j<=i; j++){
                System.out.print(rows+1-i+" ");
            }
            System.out.println();
        }
    }
    
}
