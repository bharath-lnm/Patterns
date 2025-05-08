package RAT;

public class RATn4 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        /*(for(i=1; i<=rows; i++){
            for(j=rows; j>=rows+1-i; j--){ */

            for(i=rows; i>=1; i--){
                for(j=rows; j>=i; j--){
            
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
