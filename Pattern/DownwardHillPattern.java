package Pattern;

public class DownwardHillPattern {

    public static void downwardHillPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
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
    public static void main(String[] args){
        downwardHillPattern(5);

        // *********
        //  *******
        //   *****
        //    ***
        //     *



    }
    
}
