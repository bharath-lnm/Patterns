package RAT;

public class RATn2 {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=1;i<=rows;i++){
            for(j=1;j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}