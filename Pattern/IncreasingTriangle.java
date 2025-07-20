package Pattern;

public class IncreasingTriangle {
    public static void increasingTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        increasingTriangle(5);
        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *
        

    }
    
}
