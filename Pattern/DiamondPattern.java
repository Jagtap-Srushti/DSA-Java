package Pattern;

public class DiamondPattern {
    public static void diamondPattern(int n){

        for(int i=1;i<=n;i++){
            
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=i;j<n;j++){
                System.out.print("*");
            }

            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        diamondPattern(5);
    }
    
}
