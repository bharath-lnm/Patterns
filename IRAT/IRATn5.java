package IRAT;

public class IRATn5 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows; i>=1; i--){
            for(j=rows+1-i; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
