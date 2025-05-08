package IRAT;

public class IRATS {
    public static void main(String[] args) {
        int rows=4;
        int i,j;

        for(i=rows;i>=1;i--){
            for(j=i;j>=1; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
