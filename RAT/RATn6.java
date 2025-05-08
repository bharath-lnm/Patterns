package RAT;

public class RATn6 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=1;i<=rows;i++){
            for(j=rows+1-i; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
